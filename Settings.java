import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Settings extends JFrame implements ActionListener {
    
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7,b8;
    JLabel l1;
    JLabel l2;
    JLabel l3;	
    JLabel l4;
    JLabel l5;	 
    JLabel l6;
    JLabel l7;
    JLabel l8,l9,l10;	
    JTextField t1;
    JTextField t2;
    JPasswordField p1;
    JPasswordField p2;
    public JComboBox c1;
    Background bag = new Background(new ImageIcon("images/ball.jpg").getImage());
      
 
    public Settings(String str )
    {
         super(str);   
         setLayout(null);
         
         b1=new JButton("Change Name");
	b2=new JButton("Change Password");
	 b3=new JButton("Change Question");
	 b4=new JButton("Done");
	b5=new JButton("Change");
	b6=new JButton("Change");
	b7=new JButton("Change");
        b8=new JButton("Change Avatar");
	 p1=new JPasswordField("",20);
         p2=new JPasswordField("",20);
	c1=new JComboBox();
         c1.addItem(". . . . . choose question . . . . .");
         c1.addItem("What is your pet name?");
         c1.addItem("What is your mobile number?");
         c1.addItem("What is your dad's name?");
         c1.addItem("What is your fav movie?");
	t1=new JTextField(20);
	t2=new JTextField(20);
	l1=new JLabel("");
	l2=new JLabel("");
	l3=new JLabel("");
	l4=new JLabel("");
	l5=new JLabel("");
	l6=new JLabel("");
	l7=new JLabel("");
	l8=new JLabel("");
        l9=new JLabel("");
	l10=new JLabel("");
        
	t1.setVisible(false);
	p1.setVisible(false);
	p2.setVisible(false);
	c1.setVisible(false);
        b5.setVisible(false);
	b6.setVisible(false);
	b7.setVisible(false);
	t2.setVisible(false); 
         
        
	 b4.setBounds(480,600,100,30);
	 b1.setBounds(20,200,200,50);
	 b2.setBounds(20,250,200,50);
	 b3.setBounds(20,300,200,50);
	 b5.setBounds(350,340,100,30);
	 l1.setBounds(300,250,200,20);
	 t1.setBounds(300,280,200,30);
	 l2.setBounds(350,315,200,30);
	 l3.setBounds(250,250,200,30);
	 l4.setBounds(250,315,200,30);
	 l5.setBounds(430,334,200,30);
	 l6.setBounds(430,274,200,30);
	 p1.setBounds(400,250,200,30);
	 p2.setBounds(400,310,200,30);
	 c1.setBounds(400,250,200,30);
	 l10.setBounds(430,274,200,30);
	 b6.setBounds(450,370,100,30);
	 l7.setBounds(250,250,200,30);
	 l8.setBounds(250,315,200,30);
	 b7.setBounds(450,370,100,30);
         t2.setBounds(400,310,200,30);
         l9.setBounds(430,334,200,30);    
         b8.setBounds(20,350,200,50);       

         add(b1);
         add(b2);
	 add(b3);
	 add(b4);
	 add(b5);
	 add(l1);
	 add(t1);
	add(l2);
	 add(l3);
	 add(l4);
	add(l5);
	add(l6);
	 add(p1);
         add(p2);
	 add(b6);
	add(b7);
	add(l7);
	add(l8);
	 add(t2); 
	add(c1);
        add(l9);
	add(l10);
	add(b8);
	 add(bag);
 	
	 b1.addActionListener(this);
         b2.addActionListener(this);
	 b3.addActionListener(this);
	 b4.addActionListener(this);
	 b5.addActionListener(this);
	 b6.addActionListener(this);
	 b7.addActionListener(this);
         b8.addActionListener(this);



       }
	
       
    public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
	t1.setText("");
	l1.setText("Enter New Name");
	l3.setText("");
	l4.setText("");
	l5.setText("");
	l6.setText("");
	l7.setText("");
	l8.setText("");
	l9.setText("");
	l10.setText("");
	t1.setVisible(true);
	b5.setVisible(true);
        b6.setVisible(false);
        b7.setVisible(false);
        c1.setVisible(false);
        t2.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);	
}
if(ae.getSource()==b5)
{
	if(t1.getText().equals(""))
	l2.setText("Enter valid name");	
	else
	{
	l2.setText("");
	String name1=t1.getText();
	DbCode db4=new DbCode(name1);
	l1.setText("");
	t1.setVisible(false);
	b5.setVisible(false);
        JOptionPane.showMessageDialog(null,"CHANGED SUCCESSFULLY!!!"); 
}
}
if(ae.getSource()==b2)
{
       l3.setText("Enter New Password");
       l4.setText("Retype Password");
	l1.setText("");
	l2.setText("");
	l5.setText("");
	l6.setText("");
	l7.setText("");
	l8.setText("");
	l9.setText("");
	l10.setText("");
	p1.setVisible(true);
	p2.setVisible(true);
	b6.setVisible(true);
        b5.setVisible(false);
	b7.setVisible(false);
        t1.setVisible(false);
	t2.setVisible(false);
        c1.setVisible(false);
	
}
if(ae.getSource()==b6)
{    int a=0;
	if(p1.getText().equals("")) 
	{a++;
	l5.setText("Enter password");	
	}
	if(p2.getText().equals(""))
         {a++;
	l6.setText("Enter password");	
	}
	if(p1.getText().equals(p2.getText()))
	{
	
	String name1=p1.getText();
        if(a==0)
         {
        l5.setText("");
	l6.setText("");
	DbCode db4=new DbCode(name1,6);
	l3.setText("");
        l4.setText("");
	p1.setVisible(false);
	p2.setVisible(false);
	b6.setVisible(false);
        JOptionPane.showMessageDialog(null,"CHANGED SUCCESSFULLY!!!");
         }
	}
	else
	{a++;
         l5.setText("password miss match!!");
	l6.setText("password miss match!!");
	
	}    	
}
	if(ae.getSource()==b3)
{       int z=0;
	c1.setVisible(true);
	t2.setVisible(true);
	b7.setVisible(true);
        p1.setVisible(false);
        p2.setVisible(false);
        t1.setVisible(false);
        b6.setVisible(false);
	b5.setVisible(false);
        l1.setText("");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        l5.setText("");
        l6.setText("");
        l9.setText("");
	l7.setText("Choose Qiestion");
	l8.setText("Choose Answer");
}
	if(ae.getSource()==b7)
{       int z=0;
        l9.setText("");
	l10.setText("");
	int hm=c1.getSelectedIndex();
	String u=new String();
	switch(hm)  
	{       
                case 0:
                  z++;
                  
                 break;
                  
		case 1:
               
		u="What is your pet name?";
		break;
		case 2:
		u="What is your mobile number?";
		break;
		case 3:
		u="What is your dad name?";
		case 4:
		u="What is your fav movie?";
		break;
           }
      
      String v=t2.getText();
       if(t2.getText().equals(""))
        {  l9.setText("Enter Answer!!");
           z++;
           
        }
      if(hm==0)
{
      l10.setText("Choose question!!!");
}
      if(z==0)
        {
      DbCode db8=new DbCode(u,v,10);
      JOptionPane.showMessageDialog(null,"CHANGED SUCCESSFULLY!!!");
	c1.setVisible(false);
	t2.setVisible(false);
	b7.setVisible(false);
	l7.setText("");
	l8.setText("");
        l9.setText("");
        l10.setText("");
        }
    /*  else
         {
	   l10.setText("Choose question!!!");
	}*/
	
}

if(ae.getSource()==b4)
{      //JOptionPane.showMessageDialog(null,"Settings Changed!!!");
        Profile p2=new Profile("PROFILE");
        p2.show();
        p2.setSize(700,700);
       dispose();
}

if(ae.getSource()==b8)//avatar
  {    
        Avatarsetting a=new Avatarsetting("Avatar");
        a.show();
        a.setSize(700,700);
        
    }

    
   /* public static void main(String[] args) {
        Settings s=new Settings("SETTINGS");
        s.show();
        s.setSize(700,700);
        
    }*/
}
}