
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

public class NewClass11 extends JFrame{
 private Container c4;
  private JLabel ulnc31,ulnc32,ulnc33,ulnc34,result;
  private JTextField tfnc31,tfnc32,tfnc33;
  private JButton jbnc31,jbnc32,jbnc33,rnc3,rnc4;
   NewClass11(){
        initComponents();
    }
    public void initComponents(){
        c4=this.getContentPane();
        c4.setLayout(null);
        c4.setBackground(Color.pink);

        ulnc31 = new JLabel();
        ulnc31.setText("Please enter the values: ");
        ulnc31.setBounds(50,30,1000,30);
        c4.add(ulnc31);
        ulnc32 = new JLabel();
        ulnc32.setText(" s =  ");
        ulnc32.setBounds(50,60,100,20);
        c4.add(ulnc32);
        tfnc31 =new JTextField();
        tfnc31.setBounds(150, 60, 100, 20);
        c4.add(tfnc31);

        ulnc33 = new JLabel();
        ulnc33.setText(" t =  ");
        ulnc33.setBounds(50,120,100,20);
        c4.add(ulnc33);
        tfnc32 =new JTextField();
        tfnc32.setBounds(150, 120, 100, 20);
        c4.add(tfnc32);

        result = new JLabel(" ");
        result.setBounds(200,240,100,30);
        c4.add(result);
         rnc3 = new JButton("Compute");
        rnc3.setBounds(80,240, 100, 30);
        c4.add(rnc3);
         rnc4 = new JButton("Back");
        rnc4.setBounds(80,280, 100, 30);
        c4.add(rnc4);
  rnc3.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                int one = Integer.parseInt(tfnc31.getText());
                int two = Integer.parseInt(tfnc32.getText());
                int four = (one / two);
                String answer = Integer.toString(four);
                result.setText("v = "+answer);
            }
        });
     rnc4.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                dispose();
             NewClassSVT frameSVT = new NewClassSVT();
             frameSVT.setVisible(true);
                 frameSVT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameSVT.setBounds(300, 200, 700, 800);
                frameSVT.setTitle("Physics Calculator");
                 frameSVT.setResizable(false);
            }
        });
}
public static void main(String args[]){
        NewClass11 frame12 = new NewClass11();
         frame12.setVisible(true);

    }
}