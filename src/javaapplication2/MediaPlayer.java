package javaapplication2;
import java.awt.BorderLayout;
import java.awt.Canvas;
//import java.lang.annotation.Native;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
public class MediaPlayer {
    public static void main(String[]args)
    {
        JFrame f = new JFrame();
        f.setLocation(100,100);
        f.setSize(1000,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        Canvas c = new Canvas();
        c.setBackground(color.black);
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        
        p.add(c);
        f.add(p);
        
        NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(),"C:/Program Files/VideoLAN/VLC");
        Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(),LibVlc.class);
        MediaPlayerFactory mpf = new MediaPlayerFactory();
        EmbeddedMediaPlayer emp = mpf.newEmbeddedMediaPlayer(new Win64FullScreenStrategy(f));
        emp.setVideoSurface(mpf.newVideoSurface(c));
        
        //emp.toggleFullScreen();
        
        emp.setEnableMouseInputHandling(false);
        
        emp.setEnableKeyInputHandling(false);
        
        String file = "Science – Newton’s 1st Law of Motion and Inertia in Real Life Part II – English - YouTube.mp4";
        emp.prepareMedia(file);
        emp.play();
    }
}