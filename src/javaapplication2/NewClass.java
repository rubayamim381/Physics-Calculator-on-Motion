
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
public class NewClass extends JFrame {
    private Container c1;
    private JLabel uLnc1,uLnc2,uLnc3,uLnc4,uLnc5,uLnc6,uLnc7,uLnc26,uLnc16,uLnc11,uLnc9,uLnc10,uLnc12,uLnc13,uLnc14,uLnc15,uLnc27,uLnc17,uLnc18,uLnc19,uLnc20,uLnc21,uLnc22,uLnc23,uLnc24,uLnc25;
    private JTextField tfnc1;
    private JButton jbnc1,jbnc2,rnc4;
    NewClass(){
        initComponents();
    }
    public void initComponents(){
        c1=this.getContentPane();
        c1.setLayout(null);
        c1.setBackground(Color.pink);
        
         uLnc1 = new JLabel();
        uLnc1.setText("Select required formula: ");
        uLnc1.setBounds(50,30,1000,30);
        c1.add(uLnc1);
         uLnc2 = new JLabel();
        uLnc2.setText("1: v = u + at ");
        uLnc2.setBounds(50,70,1000,30);
        c1.add(uLnc2);
        uLnc3 = new JLabel();
        uLnc3.setText("2: s = vt ");
        uLnc3.setBounds(50,110,1000,30);
        c1.add(uLnc3);
        uLnc4 = new JLabel();
        uLnc4.setText("3: s = ut + 1/2at\u00B2 ");
        uLnc4.setBounds(50,150,1000,30);
        c1.add(uLnc4);
        uLnc5 = new JLabel();
        uLnc5.setText("4: v\u00B2 = u\u00B2 + 2as ");
        uLnc5.setBounds(50,190,1000,30);
        c1.add(uLnc5);
        uLnc6 = new JLabel();
        uLnc6.setText("5: H = u\u00B2sin\u00B2\u03B8/2g");
        uLnc6.setBounds(50,230,1000,30);
        c1.add(uLnc6);
        uLnc7 = new JLabel();
        uLnc7.setText("6: T = 2usin\u03B8/g ");
        uLnc7.setBounds(50,270,1000,30);
        c1.add(uLnc7);
        uLnc26 = new JLabel();
        uLnc26.setText("7: R = u\u00B2sin2\u03B8/g");
        uLnc26.setBounds(50,310,1000,30);
        c1.add(uLnc26);

        uLnc16 = new JLabel();
        uLnc16.setText("8: E = F/q\u2080");
        uLnc16.setBounds(50,350,1000,30);
        c1.add(uLnc16);
        
        uLnc9 = new JLabel();
        uLnc9.setText("9: T = u/g");
        uLnc9.setBounds(50,390,1000,30);
        c1.add(uLnc9);
        uLnc10 = new JLabel();
        uLnc10.setText("10: a = v\u00B2/r");
        uLnc10.setBounds(50,430,1000,30);
        c1.add(uLnc10);
        uLnc11 = new JLabel();
        uLnc11.setText("11: F = mv\u00B2/r");
        uLnc11.setBounds(50,470,1000,30);
        c1.add(uLnc11);
        uLnc12 = new JLabel();
        uLnc12.setText("12: F = m\u03C9\u00B2r");
        uLnc12.setBounds(50,510,1000,30);
        c1.add(uLnc12);
        uLnc27 = new JLabel();
        uLnc27.setText("13: F = ma");
        uLnc27.setBounds(50,550,1000,30);
        c1.add(uLnc27);
        uLnc13 = new JLabel();
        uLnc13.setText("14: J = Ft");
        uLnc13.setBounds(50,590,1000,30);
        c1.add(uLnc13);
        uLnc14 = new JLabel();
        uLnc14.setText("15: J = m(v - u)");
        uLnc14.setBounds(50,630,1000,30);
        c1.add(uLnc14);
        
        uLnc17 = new JLabel();
        uLnc17.setText("16: I = MK\u00B2");
        uLnc17.setBounds(250,70,1000,30);
        c1.add(uLnc17);
        uLnc18 = new JLabel();
        uLnc18.setText("17: L = Mr\u00B2\u03C9");
        uLnc18.setBounds(250,110,1000,30);
        c1.add(uLnc18);
        uLnc19 = new JLabel();
        uLnc19.setText("18: \u03C4 = I\u03B1");
        uLnc19.setBounds(250,150,1000,30);
        c1.add(uLnc19);
        
        uLnc21 = new JLabel();
        uLnc21.setText("19: \u03C9 = 2\u03C0n");
        uLnc21.setBounds(250,190,1000,30);
        c1.add(uLnc21);
        uLnc22 = new JLabel();
        uLnc22.setText("20: v = \u03C9r");
        uLnc22.setBounds(250,230,1000,30);
        c1.add(uLnc22);
        uLnc23 = new JLabel();
        uLnc23.setText("21: a = \u03B1r");
        uLnc23.setBounds(250,270,1000,30);
        c1.add(uLnc23);
        uLnc24 = new JLabel();
        uLnc24.setText("22: tan\u03B8 = v\u00B2/rg");
        uLnc24.setBounds(250,310,1000,30);
        c1.add(uLnc24);
        uLnc25 = new JLabel();
        uLnc25.setText("23: tan\u03B8 = h/x");
        uLnc25.setBounds(250,350,1000,30);
        c1.add(uLnc25);
     
        tfnc1 =new JTextField();
        tfnc1.setBounds(380, 350, 100, 20);
        c1.add(tfnc1);
        rnc4 = new JButton("Back");
        rnc4.setBounds(380,390, 100, 30);
        c1.add(rnc4);
            tfnc1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){

                int snc1=Integer.parseInt(tfnc1.getText());

                if(snc1==1){
                    JOptionPane.showMessageDialog(null,"You have selected v = u + at ");
                    dispose();
                 NewClass10 frame11 = new NewClass10();
                 frame11.setVisible(true);
                 frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame11.setBounds(300, 200, 700, 800);
                frame11.setTitle("Physics Calculator");
                 frame11.setResizable(false);

                }
                else if(snc1==2){
                    JOptionPane.showMessageDialog(null,"You have selected s = vt ");
                    dispose();
                    NewClassSVT frameSVT = new NewClassSVT();
                 frameSVT.setVisible(true);
                 frameSVT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameSVT.setBounds(300, 200, 700, 800);
                frameSVT.setTitle("Physics Formula");
                 frameSVT.setResizable(false);
                }
                else if(snc1==3){
                    JOptionPane.showMessageDialog(null,"You have selected s = ut + 1/2at\u00B2 ");
                    dispose();
                    NewClassSUT12AT frameSUT12AT = new NewClassSUT12AT();
                 frameSUT12AT.setVisible(true);
                 frameSUT12AT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameSUT12AT.setBounds(300, 200, 700, 800);
                frameSUT12AT.setTitle("Physics Formula");
                 frameSUT12AT.setResizable(false);
                }
                   else if(snc1==4){
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
                   }
                  else if(snc1==7){
                    JOptionPane.showMessageDialog(null,"You have selected R = u\u00B2sin2\u03B8/g ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==8){
                    JOptionPane.showMessageDialog(null,"You have selected E = F/q\u2080 ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==9){
                    JOptionPane.showMessageDialog(null,"You have selected T = u/g ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==10){
                    JOptionPane.showMessageDialog(null,"You have selected  a = v\u00B2/r");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==11){
                    JOptionPane.showMessageDialog(null,"You have selected F = mv\u00B2/r ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==12){
                    JOptionPane.showMessageDialog(null,"You have selected  F = m\u03C9\u00B2r");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==13){
                    JOptionPane.showMessageDialog(null,"You have selected F = ma ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==14){
                    JOptionPane.showMessageDialog(null,"You have selected J = Ft ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==15){
                    JOptionPane.showMessageDialog(null,"You have selected J = m(v - u) ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==16){
                    JOptionPane.showMessageDialog(null,"You have selected I = MK\u00B2 ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==17){
                    JOptionPane.showMessageDialog(null,"You have selected L = Mr\u00B2\u03C9 ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==18){
                    JOptionPane.showMessageDialog(null,"You have selected \u03C4 = I\u03B1 ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==19){
                    JOptionPane.showMessageDialog(null,"You have selected \u03C9 = 2\u03C0n ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==20){
                    JOptionPane.showMessageDialog(null,"You have selected v = \u03C9r ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==21){
                    JOptionPane.showMessageDialog(null,"You have selected a = \u03B1r ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==22){
                    JOptionPane.showMessageDialog(null,"You have selected tan\u03B8 = v\u00B2/rg ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
                  else if(snc1==23){
                    JOptionPane.showMessageDialog(null,"You have selected tan\u03B8 = h/x ");
                    dispose();
                    NewClassVU2AS frameVU2AS = new NewClassVU2AS();
                 frameVU2AS.setVisible(true);
                 frameVU2AS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frameVU2AS.setBounds(300, 200, 700, 800);
                frameVU2AS.setTitle("Physics Formula");
                 frameVU2AS.setResizable(false);
                   }
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
                frame.setTitle("Physics Calculator");
                 frame.setResizable(false);
            }
        });
    }
    public static void main(String args[]){
        NewClass frame1 = new NewClass();
         frame1.setVisible(true);
                
    }
}
