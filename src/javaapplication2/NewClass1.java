
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
public class NewClass1 extends JFrame {
  private Container c2;
  private JLabel uLnc1,uLnc2,uLnc3,uLnc4,uLnc5,uLnc6,uLnc7,uLnc26,uLnc16,uLnc11,uLnc9,uLnc10,uLnc12,uLnc13,uLnc14,uLnc15,uLnc27,uLnc17,uLnc18,uLnc19,uLnc20,uLnc21,uLnc22,uLnc23,uLnc24,uLnc25;
    private JTextField tfnc1;
    private JButton jbnc1,jbnc2,rnc4;
    NewClass1(){
        initComponents();
    }
    public void initComponents(){
        c2=this.getContentPane();
        c2.setLayout(null);
        c2.setBackground(Color.pink);
        
        uLnc1 = new JLabel();
        uLnc1.setText("Select required formula: ");
        uLnc1.setBounds(50,30,1000,30);
        c2.add(uLnc1);
         uLnc2 = new JLabel();
        uLnc2.setText("1: R\u00B2 = P\u00B2 + Q\u00B2 +2PQcos\u03B8");
        uLnc2.setBounds(50,70,1000,30);
        c2.add(uLnc2);
        uLnc3 = new JLabel();
        uLnc3.setText("2: R\u00B2 = P\u00B2 + Q\u00B2 ");
        uLnc3.setBounds(50,110,1000,30);
        c2.add(uLnc3);
        uLnc4 = new JLabel();
        uLnc4.setText("3: \u03B8 = \u03B1/2 ");
        uLnc4.setBounds(50,150,1000,30);
        c2.add(uLnc4);
      /*  uLnc5 = new JLabel();
        uLnc5.setText("4: v\u00B2 = u\u00B2 + 2as ");
        uLnc5.setBounds(50,190,1000,30);
        c2.add(uLnc5);
        uLnc6 = new JLabel();
        uLnc6.setText("5: H = u\u00B2sin\u00B2\u03B8/2g");
        uLnc6.setBounds(50,230,1000,30);
        c2.add(uLnc6); */
        
        tfnc1 =new JTextField();
        tfnc1.setBounds(50, 190, 100, 20);
        c2.add(tfnc1);
        rnc4 = new JButton("Back");
        rnc4.setBounds(50,230, 100, 30);
        c2.add(rnc4);
            tfnc1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){

                int snc1=Integer.parseInt(tfnc1.getText());

                if(snc1==1){
                    JOptionPane.showMessageDialog(null,"You have selected R\u00B2 = P\u00B2 + Q\u00B2 +2PQcos\u03B8 ");
                    dispose();
                 NewClass10 frame11 = new NewClass10();
                 frame11.setVisible(true);
                 frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame11.setBounds(300, 200, 700, 800);
                frame11.setTitle("Physics Calculator on Kinetics and Mechanics");
                 frame11.setResizable(false);

                }
                else if(snc1==2){
                    JOptionPane.showMessageDialog(null,"R\u00B2 = P\u00B2 + Q\u00B2 ");
                    dispose();
                    NewClassSVT frameSVT = new NewClassSVT();
                 frameSVT.setVisible(true);
                 frameSVT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameSVT.setBounds(300, 200, 700, 800);
                frameSVT.setTitle("Physics Formula");
                 frameSVT.setResizable(false);
                }
                else if(snc1==3){
                    JOptionPane.showMessageDialog(null,"You have selected \u03B8 = \u03B1/2 ");
                    dispose();
                    NewClassSUT12AT frameSUT12AT = new NewClassSUT12AT();
                 frameSUT12AT.setVisible(true);
                 frameSUT12AT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameSUT12AT.setBounds(300, 200, 700, 800);
                frameSUT12AT.setTitle("Physics Calculator on Kinetics and Mechanics");
                 frameSUT12AT.setResizable(false);
                }
                   /* else if(snc1==4){
                    JOptionPane.showMessageDialog(null,"You have selected v\u00B2 = u\u00B2 + 2as ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==5){
                    JOptionPane.showMessageDialog(null,"You have selected H = u\u00B2sin\u00B2\u03B8/2g ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==6){
                    JOptionPane.showMessageDialog(null,"You have selected  T = 2usin\u03B8/g");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   } */
                else{
                    JOptionPane.showMessageDialog(null,"You have selected wrong option");

                }
            }
        });
         rnc4.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                dispose();
             Splash frame=new Splash();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame.setBounds(300, 200, 700, 800);
                frame.setTitle("Physics Calculator on Kinetics and Mechanics");
                 frame.setResizable(false);
            }
        });
    }

    public static void main(String args[]){
        NewClass1 frame2 = new NewClass1();
         frame2.setVisible(true);
          
    }
}

