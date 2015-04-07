import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.ItemSelectable;




public class Signup extends JFrame implements ActionListener 
 
 {	
	String v=new String("male");
        public static int z;
        public static int k;
        String av="pics/1.jpg";
    JButton b1;
    JButton b2,b3;

    JLabel  l1;
    JLabel  l2;
    JLabel  l3;
    JLabel  l4;
    JLabel  l5;
    JLabel  l6;
    JLabel  l7;
    JLabel  l8,l9,l10,l11,l12,l13,l15,l16,l17;
	
/*    CheckboxGroup cbg1;
    Checkbox cb1,cb2;
*/
    JTextField t1;
    JTextField t2;
    JTextField t3;

    JComboBox c1;

    JRadioButton r1;
    JRadioButton r2;

    JPasswordField p1;
    JPasswordField p2;
   
    Background bag = new Background(new ImageIcon("images/wolf.jpg").getImage());

    public Signup(String str ) 
 
      {
         super(str);   
         
         setLayout(null);
         
         b1=new JButton("I Accept!");
         b2=new JButton("Back");
	 b3=new JButton("Click!!!");

         l1=new JLabel("Name");
         l2=new JLabel("UserName");
         l3=new JLabel("Password");
         l4=new JLabel("Retype Password");
         l5=new JLabel("Forgot Password Question");
         l6=new JLabel("Answer");
         l7=new JLabel("Sex");
         l8=new JLabel("Terms and Conditions :");
	 l9=new JLabel("");
	 l10=new JLabel("");
         l11=new JLabel("");
	 l12=new JLabel("");
	 l13=new JLabel("");
	 l15=new JLabel("");
         l16=new JLabel("");
	 l17=new JLabel("Choose Avatar");
	

	 t1=new JTextField(20);
         t2=new JTextField(20);
         t3=new JTextField(20);

         c1=new JComboBox();

         r1=new JRadioButton("Male",true);
         r2=new JRadioButton("Female");

         p1=new JPasswordField();
         p2=new JPasswordField();

         c1.addItem(". . . . . choose question . . . . .");
         c1.addItem("What is your pet name?");
         c1.addItem("What is your mobile number?");
         c1.addItem("What is your dad's name?");
         c1.addItem("What is your fav movie?");
         
                 
         b1.setBounds(180,600,100,30);
         b2.setBounds(550,600,100,30);
	 b3.setBounds(200,450,100,30);
         
         l1.setBounds(20,100,100,20);
         l2.setBounds(20,200,200,20);
         l3.setBounds(20,250,200,20);
         l4.setBounds(20,300,200,20);
         l5.setBounds(20,350,200,20);
         l6.setBounds(20,400,200,20);
         l7.setBounds(20,150,200,20);
         l8.setBounds(20,500,200,20);
	 l9.setBounds(430,250,200,20);
	 l10.setBounds(430,300,200,20);
	 l11.setBounds(430,100,200,20);
	 l12.setBounds(50,50,500,20);
 	 l13.setBounds(430,200,200,20);
  	 l15.setBounds(430,400,200,20);
         l16.setBounds(420,350,200,20);
         l17.setBounds(20,450,200,20);

         r1.setBounds(200,150,100,20);
         r2.setBounds(300,150,100,20);
         
         t1.setBounds(200,100,200,20);
         t2.setBounds(200,200,200,20);
         t3.setBounds(200,400,200,20);

         p1.setBounds(200,250,200,20);
         p2.setBounds(200,300,200,20);
         
         c1.setBounds(200,350,200,20);
         
         add(b1);
         add(b2);
	 add(b3);
         add(l1);
         add(l2);         
         add(l3);
         add(l4);         
         add(l5);
         add(l6);
         add(l7);
	 add(l8);
         add(t1);
         add(t2);
         add(t3);
         add(c1);
         add(r1);
         add(r2);
         add(p1);
         add(p2);
	 add(l9);
	 add(l10);
	 add(l11);
	 add(l12);
	 add(l13);
         add(l15);
	add(l16);
        add(l17);
	//add(cb1);
  	//add(cb2); 	
         add(bag);
  	 ButtonGroup g=new ButtonGroup();
         g.add(r1);
         g.add(r2);
	
         
         b2.addActionListener(this);
         b1.addActionListener(this);
         b3.addActionListener(this);
	 r1.addActionListener(this);
	 r2.addActionListener(this);
	 
	

       }
      
      public void actionPerformed(ActionEvent ae)
    {   k=1;
           
	if (ae.getSource()==b3)
           {
 	
                Avatar a=new Avatar("Avatar");
                a.show();
                a.setSize(700,700);
            }

	if (ae.getSource()==r1)
           {
 	
                v="male"; 
                k++;
                System.out.println(k);
            }

	if (ae.getSource()==r2)
           {
 		
                v="female";
                k++;
                System.out.println(k); 
            } 
      if(ae.getSource()==b1)
       {
	//k=1;
        
	if(p1.getText().equals(p2.getText()))
	{
        k++;
      	System.out.println(k);
	}
         else
         {
                l9.setForeground(Color.RED);
		l9.setText("O");
		p1.setText("");
		l10.setForeground(Color.RED);
		l10.setText("O");
		p2.setText("");
 	}
	
		
 	if(t1.getText().equals("")) 
	{
	l11.setForeground(Color.RED);
		l11.setText("O");
 	}
	else
	{
	l11.setText("");
	k++;
	}
	if(t2.getText().equals(""))
	{
	l13.setForeground(Color.RED);
		l13.setText("O");
	}
        else
	{
          l13.setText("");
           
	k++;
	}
	if(t3.getText().equals(""))
	{
	l15.setForeground(Color.RED);
		l15.setText("O");
	}
        
        else
	{
          l15.setText("");
	k++;
	}         
	if(p1.getText().equals(""))
	{
	l9.setForeground(Color.RED);
		l9.setText("O");
	}
        else
	{
	k++;
	   l9.setText("");
	}
	if(p2.getText().equals(""))
	{
	l10.setForeground(Color.RED);
		l10.setText("O");
	}else
	{
          l10.setText("");
	k++;
	}
        int hm=c1.getSelectedIndex();
	String u=new String();
	switch(hm)
	{       
                case 0:
                  l16.setForeground(Color.RED);
		  l16.setText("Choose a question!!");
                  k++;
                  break;
		case 1:
		u="What is your pet name?";
                l16.setText("");
		break;
		case 2:
		u="What is your mobile number?";
		l16.setText("");
		break;
		case 3:
		u="What is your dad's name?";
		l16.setText("");
		break;
		case 4:
		u="What is your fav movie?";
		l16.setText("");
		break;

		
	}
        
        if(k==7)
	{ av=Avatar.ava1;
	
        String p=t1.getText(),q=t2.getText(),r=p1.getText(),s=p2.getText(),t=t3.getText();
	DbCode db2=new DbCode(p,q,r,s,u,t,v,av);
   	l12.setText("");
        }

        else
	{
		  l12.setForeground(Color.red);
		  l12.setText("Reenter the fields marked with O!!! ");
	}
	
	if(k==7)
	{
	JOptionPane.showMessageDialog(null,"Registered Successfully!!!");
        dispose();
        Home gz=new Home("HOME");
        gz.show();
        gz.setSize(700,700);
   	}
        if(k==10)
        {
         l13.setForeground(Color.RED);
         l13.setText("User name already present!!!");
         t2.setText("");
        }
   

}
     if(ae.getSource()==b2)
      {
      dispose();
       Home gz=new Home("HOME");
        gz.show();
        gz.setSize(700,700);
       }
       }
    
   /* public static void main(String[] args) 
     
    {
        Signup s=new Signup("Signup");
        s.show();
        s.setSize(700,700);
        
     }*/

}
