import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Compose extends JFrame implements ActionListener
{
JButton jb1;
JButton jb2;
JLabel jl1;
JLabel jl2;
JLabel jl3;
JTextField jt1;
JTextField jt2;
TextArea jt3;
Background bag = new Background(new ImageIcon("images/dragon.jpg").getImage());
public Compose(String str)
{
super(str);
setLayout(null);
jb1=new JButton("SEND");
jb2=new JButton("BACk");
jt1=new JTextField(20);
jt2=new JTextField(20);
jt3=new TextArea();
jl1=new JLabel("TO:");
jl2=new JLabel("SUBJECT:");
jl3=new JLabel("BODY:");
jl1.setBounds(50,100,50,20);
jt1.setBounds(120,100,300,20);
jl2.setBounds(50,150,70,20); 
jt2.setBounds(120,150,300,20);
jl3.setBounds(50,200,50,20);
jt3.setBounds(120,200,300,250);
jb1.setBounds(50,600,100,30);
jb2.setBounds(500,600,100,30);
jb2.addActionListener(this);
jb1.addActionListener(this);
add(jl1);
add(jl2);
add(jl3);
add(jt1);
add(jt2);
add(jt3);
add(jb1);
add(jb2);
add(bag);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==jb2)
{     
       Mail s=new Mail("MAIL");
        s.show();
        s.setSize(700,700);
        dispose();
}

if(ae.getSource()==jb1)
{  DbCode db19=new DbCode(jt1.getText(),jt2.getText(),jt3.getText(),89);
   dispose(); 
   Mail s1=new Mail("MAIL");
        s1.show();
        s1.setSize(700,700);
    
}

}
/*public static void main(String[] s)
{
Compose cal = new Compose("COMPOSE");
cal.show();
cal.setSize(700,700);
}*/
}
