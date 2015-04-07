import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Profile extends JFrame implements ActionListener{
	//String ava1="pics/1.jpg";
    JButton b;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6; 
     DbCode avatar=new DbCode(8.8);
     Background bag = new Background(new ImageIcon("images/dragon.jpg").getImage());
     Picture pic1 = new Picture(new ImageIcon(DbCode.bb).getImage());//just an example to add image
    public Profile(String str )
    {
         super(str);   
         setLayout(null);
	 
         b=new JButton("Mail");
         b1=new JButton("Chat");
         b2=new JButton("Settings");
         b3=new JButton("About");
         b4=new JButton("Sign Out");
         
        // b5=new JButton("Back");
         
         b.setBounds(20,200,200,50);
         b1.setBounds(20,250,200,50);
         b2.setBounds(20,300,200,50);
         b3.setBounds(20,350,200,50);
        // b4.setBounds(20,400,200,50);
         
         b4.setBounds(550,600,100,30);
         
         b2.addActionListener(this);
         b.addActionListener(this);
         
         b4.addActionListener(this);
         add(b);
         add(b1);
         add(b2);
         add(b3);
         add(b4);
         add(pic1);
         add(bag);
         
         //add(b5);

    }
    public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b2)
{
dispose();
 Settings s=new Settings("SETTINGS");
        s.show();
        s.setSize(700,700);
}
if(ae.getSource()==b)
{
dispose();
Mail s1=new Mail("MAIL");
        s1.show();
        s1.setSize(700,700);
}
if(ae.getSource()==b4)
{
     dispose();
     Home gz=new Home("HOME");
        gz.show();
        gz.setSize(700,700);
}
}

    
  /*  public static void main(String[] args) {
        Profile p=new Profile("PROFILE");
        p.show();
        p.setSize(700,700);
        
    }*/
}
