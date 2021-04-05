
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
public class NewClass10 extends JFrame {
    private Container c1;
    private JLabel uLnc1,uLnc2,uLnc3,uLnc4,uLnc5;
    private JTextField tfnc1;
    private JButton jbnc1,jbnc2,rnc4;
    NewClass10(){
        initComponents();
    }
    public void initComponents(){
        c1=this.getContentPane();
        c1.setLayout(null);
        c1.setBackground(Color.pink);
         uLnc1 = new JLabel();
        uLnc1.setText("Select required value: ");
        uLnc1.setBounds(50,30,1000,30);
        c1.add(uLnc1);
        uLnc2 = new JLabel();
        uLnc2.setText("1: v =  ");
        uLnc2.setBounds(50,70,1000,30);
        c1.add(uLnc2);
        uLnc3 = new JLabel();
        uLnc3.setText("2: u =  ");
        uLnc3.setBounds(50,110,1000,30);
        c1.add(uLnc3);
        uLnc4 = new JLabel();
        uLnc4.setText("3: a =  ");
        uLnc4.setBounds(50,150,1000,30);
        c1.add(uLnc4);
        uLnc5 = new JLabel();
        uLnc5.setText("4: t =  ");
        uLnc5.setBounds(50,190,1000,30);
        c1.add(uLnc5);
        tfnc1 =new JTextField();
        tfnc1.setBounds(200, 240, 100, 20);
        c1.add(tfnc1);
        rnc4 = new JButton("Back");
        rnc4.setBounds(200,290, 100, 30);
        c1.add(rnc4);
            tfnc1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){

                int snc1=Integer.parseInt(tfnc1.getText());

                if(snc1==1){
                    JOptionPane.showMessageDialog(null,"You have selected v = ? ");
                    dispose();
                 NewClass3 frame4 = new NewClass3();
                 frame4.setVisible(true);
                 frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame4.setBounds(300, 200, 700, 800);
                frame4.setTitle("Physics Calculator");
                 frame4.setResizable(false);

                }
                else if(snc1==2){
                    JOptionPane.showMessageDialog(null,"You have selected u = ? ");
                    dispose();
                    NewClass7 frame8 = new NewClass7();
                 frame8.setVisible(true);
                 frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame8.setBounds(300, 200, 700, 800);
                frame8.setTitle("Physics Formula");
                 frame8.setResizable(false);
                }
                else if(snc1==3){
                    JOptionPane.showMessageDialog(null,"You have selected a = ? ");
                    dispose();
                    NewClass8 frame9 = new NewClass8();
                 frame9.setVisible(true);
                 frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame9.setBounds(300, 200, 700, 800);
                frame9.setTitle("Physics Formula");
                 frame9.setResizable(false);
                }
                   else if(snc1==4){
                    JOptionPane.showMessageDialog(null,"You have selected t = ? ");
                    dispose();
                    NewClass9 frame10 = new NewClass9();
                 frame10.setVisible(true);
                 frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame10.setBounds(300, 200, 700, 800);
                frame10.setTitle("Physics Formula");
                 frame10.setResizable(false);
                   }
                else{
                    JOptionPane.showMessageDialog(null,"You have selected wrong option");

                }
            }
        });
          rnc4.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                dispose();
             NewClass frame1 = new NewClass();
             frame1.setVisible(true);
                 frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame1.setBounds(300, 200, 700, 800);
                frame1.setTitle("Physics Calculator");
                 frame1.setResizable(false);
            }
        });
    }
    public static void main(String args[]){
        NewClass10 frame11 = new NewClass10();
         frame11.setVisible(true);

    }
}



