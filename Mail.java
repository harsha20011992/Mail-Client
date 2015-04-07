import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mail extends JFrame implements ActionListener {
    JButton b;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
     Background bag = new Background(new ImageIcon("images/dragon.jpg").getImage());
    
    
    public Mail(String str )
    {
         super(str);   
         setLayout(null);
         b=new JButton("Compose");
         b1=new JButton("Inbox");
         b2=new JButton("Send");
         b3=new JButton("Delete");
         
         
         b4=new JButton("Back");
         
         b.setBounds(20,200,200,50);
         b1.setBounds(20,250,200,50);
         b2.setBounds(20,300,200,50);
         b3.setBounds(20,350,200,50);
         b4.setBounds(300,500,100,30);

         b4.addActionListener(this);
         b.addActionListener(this);
         b2.addActionListener(this);
         b1.addActionListener(this);
         add(b);
         add(b1);
         add(b2);
         add(b3);
         add(b4);
         add(bag);
         
         

    }
    
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b)
{

Compose cal = new Compose("COMPOSE");
cal.show();
cal.setSize(700,700); 
dispose();
}
if(ae.getSource()==b1)
{
DbCode1 dbin=new DbCode1(8,9);
DbCode1 dbin1=new DbCode1(90,2,2);
}
if(ae.getSource()==b4)

{
 Profile p1=new Profile("PROFILE");
        p1.show();
        p1.setSize(700,700); 

dispose();
}
if(ae.getSource()==b2)
{
DbCode dbsent= new DbCode();
DbCode dbsent1= new DbCode(9);
}
}
    
   /* public static void main(String[] args) {
        Mail s=new Mail("MAIL");
        s.show();
        s.setSize(700,700);
        
    }*/
}
