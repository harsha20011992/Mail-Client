import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Forget extends JFrame implements ActionListener
{

 public static int y;
JButton b;
JButton b1;
JTextField t1;
JTextField t2;
JLabel l1;
JLabel l2;
JLabel l3;
JLabel l4,l5,l6,l7;
JComboBox c1;
 Background bag = new Background(new ImageIcon("images/dragon.jpg").getImage());
public Forget(String str)
{
super(str);
setLayout(null);
b=new JButton("Back");
b1=new JButton("Get in!!");
l1=new JLabel("Forget Password Question");
l2=new JLabel("Answer");
l3=new JLabel("Username");
l4=new JLabel("");
l5=new JLabel("");
l6=new JLabel("");
l7=new JLabel("");
c1=new JComboBox();
         c1.addItem(". . . . . choose question . . . . .");
         c1.addItem("What is your pet name?");
         c1.addItem("What is your mobile number?");
         c1.addItem("What is your dad's name?");
         c1.addItem("What is your dog name?");
         
t1=new JTextField(20);
t2=new JTextField(20);
b.setBounds(400,500,100,30);
l3.setBounds(20,100,100,20);
l1.setBounds(20,170,300,20);
l2.setBounds(20,250,100,20);
l4.setBounds(280,130,100,20);
l6.setBounds(280,200,200,20);
l7.setBounds(50,50,300,20);
l5.setBounds(280,270,100,20);
t1.setBounds(60,130,200,20);
t2.setBounds(60,270,200,20);
c1.setBounds(60,200,200,20);
b1.setBounds(20,500,100,30);

l1.setForeground(Color.WHITE);
l2.setForeground(Color.WHITE);
l3.setForeground(Color.WHITE);


b.addActionListener(this);
b1.addActionListener(this);
add(b);
add(l1);
add(l2);
add(l3);
add(c1);
add(t2);
add(t1);
add(b1);
add(l4);
add(l5);
add(l6);
add(l7);
add(bag);
}
public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==b)
      { dispose();
        Home gz1=new Home("HOME");
        gz1.show();
        gz1.setSize(700,700);
      }

     if(ae.getSource()==b1)
      {// dispose();
        int k=1;
        if(t1.getText().equals("")) 
	{
	l4.setForeground(Color.RED);
		l4.setText("O");
 	}
	else
	{
	 k++;
	 l4.setText("");
	
	}
	if(t2.getText().equals("")) 
	{
	l5.setForeground(Color.RED);
		l5.setText("O");
 	}
	else
	{
	 k++;
	 l5.setText("");
	  
	}
        int hm=c1.getSelectedIndex();
	String u=new String();
	switch(hm)
	{       
                case 0:
                  l6.setForeground(Color.RED);
		  l6.setText("Choose a question!!");
                  k++;
                  break;
		case 1:
		u="What is your pet name?";
                l6.setText("");
		break;
		case 2:
		u="What is your mobile number?";
		l6.setText("");
		break;
		case 3:
		u="What is your dad's name?";
		l6.setText("");
		break;
		case 4:
		u="What is your dog name?";
		l6.setText("");
		break;

		
	}
        if(k==3)
	{
	
        String p=t1.getText(),q=t2.getText();
	DbCode db3=new DbCode(p,q,u);
   	l7.setText("");
        }else
	{
		  l7.setForeground(Color.red);
		  l7.setText("Re enter the fields marked with O!!! ");
                  t1.setText("");
		  t2.setText("");
                  
	}
       if(y==10)
       {  //System.out.println("aaa");
                  t1.setText("");
		  t2.setText("");
                  l6.setForeground(Color.RED);
		  l6.setText("Choose question again!!");
		  l5.setForeground(Color.RED);
		  l5.setText("O");
		  l4.setForeground(Color.RED);
		  l4.setText("O");
		   l7.setForeground(Color.red);
		  l7.setText("Re enter the fields marked with O!!! ");
		  hm=0;
        }
      }
    }
/* public static void main(String[] args) {
        Forget s=new Forget("Forgot Password");
        s.show();
        s.setSize(700,700);
        
    }*/
}
