
package javaapplication2;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NewClass2 extends JFrame{
    private Container c3;
    NewClass2(){
        initComponents();
    }
    public void initComponents(){
        c3=this.getContentPane();
        c3.setLayout(null);
        c3.setBackground(Color.pink);
    }
    public static void main(String args[]){
        NewClass2 frame3 = new NewClass2();
         frame3.setVisible(true);

    }
}
