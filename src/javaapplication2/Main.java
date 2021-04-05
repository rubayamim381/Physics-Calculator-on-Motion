package javaapplication2;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Container;
public class Main extends JFrame {
    private JLabel imglabel;
    private Container c;
    private ImageIcon img;
   /* Main(){
        initComponents();
    }
    public void initComponents(){

        img = new ImageIcon(getClass().getResource("download.png"));
        imglabel = new JLabel(img);
        imglabel.setBounds(50,100,500,300);
        c.add(imglabel);
    }*/
    
    
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 200, 500, 400);
        frame.setTitle("Physics Formula");
        frame.setResizable(false);
        //JOptionPane.showMessageDialog(null, "Welcome", "Physics Formula",3);
       // JOptionPane.showMessageDialog(null, "Choose one option:1 for Pressure,2 for Temperature", "Physics Formula", -1)
        //String ch1=JOptionPane.showInputDialog(null, "Enter Your Choice: ","Physics Formula",1);
        //if(ch1=='1'){
       // JOptionPane.showMessageDialog(null,"You have chosen option 1","Physics Formula",3);}
       // else{
         // JOptionPane.showMessageDialog(null,"You have chosen option 2","Physics Formula",3);
       // }
        //JOptionPane.showInputDialog()

}}
