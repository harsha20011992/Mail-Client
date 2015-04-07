import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Avatarsetting extends JFrame implements ActionListener
{  
   Picture1 pic1 = new Picture1(new ImageIcon("pics/1.jpg").getImage());
   Picture2 pic2 = new Picture2(new ImageIcon("pics/2.png").getImage());
   Picture3 pic3 = new Picture3(new ImageIcon("pics/3.jpg").getImage());
   Picture4 pic4 = new Picture4(new ImageIcon("pics/4.jpg").getImage());
   Picture5 pic5 = new Picture5(new ImageIcon("pics/5.jpg").getImage());
   
   JButton jb1,jb2,jb3,jb4,jb5;
   static String ava2;
   

	public Avatarsetting(String str)

	   {
	        super(str);
		setLayout(null);
		
                jb1=new JButton("Select");
		jb2=new JButton("Select");
		jb3=new JButton("Select");
		jb4=new JButton("Select");
		jb5=new JButton("Select");
		

		jb1.setBounds(30,180,100,30);
		jb2.setBounds(160,180,100,30);
		jb3.setBounds(290,180,100,30);
		jb4.setBounds(420,180,100,30);
		jb5.setBounds(550,180,100,30);
        
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);

		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(pic1);
		add(pic2);
		add(pic3);
		add(pic4);
		add(pic5);
	   }

 public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==jb1)
		{   
                   ava2="pics/1.jpg";
                   System.out.println(ava2);
		 
                DbCode db10=new DbCode(ava2,8.8);
     		}

         if(ae.getSource()==jb2)
		{   
                   ava2="pics/2.png";
                   System.out.println(ava2);
		DbCode db10=new DbCode(ava2,8.8);
		}

         if(ae.getSource()==jb3)
		{   
                   ava2="pics/3.jpg";
                   System.out.println(ava2);
		DbCode db10=new DbCode(ava2,8.8);
		}

         if(ae.getSource()==jb4)
		{   
                   ava2="pics/4.jpg";
                   System.out.println(ava2);
		DbCode db10=new DbCode(ava2,8.8);
		}

         if(ae.getSource()==jb5)
		{   
                   ava2="pics/5.jpg";
                   System.out.println(ava2);
		DbCode db10=new DbCode(ava2,8.8);
		}

     }




 /*public static void main(String[] args) 
    {
        Avatar a=new Avatar("Avatar");
        a.show();
        a.setSize(700,700);
        
    }*/


}
class Picture1 extends JPanel
 {

   Image image;

   public Picture1(Image img) 
     {
      image = img;
      setSize(700,700);
      setLayout(null);
     }

   public void paintComponent(Graphics g) 
    {
      g.drawImage(image,0,0,null);
    }
 }
class Picture2 extends JPanel
 {

   Image image;

   public Picture2(Image img) 
     {
      image = img;
      setSize(700,700);
      setLayout(null);
     }

   public void paintComponent(Graphics g) 
    {
      g.drawImage(image,140,0,null);
    }
 }
class Picture3 extends JPanel
 {

   Image image;

   public Picture3(Image img) 
     {
      image = img;
      setSize(700,700);
      setLayout(null);
     }

   public void paintComponent(Graphics g) 
    {
      g.drawImage(image,280,0,null);
    }
 }


class Picture4 extends JPanel
 {

   Image image;

   public Picture4(Image img) 
     {
      image = img;
      setSize(700,700);
      setLayout(null);
     }

   public void paintComponent(Graphics g) 
    {
      g.drawImage(image,420,0,null);
    }
 }

class Picture5 extends JPanel
 {

   Image image;

   public Picture5(Image img) 
     {
      image = img;
      setSize(700,700);
      setLayout(null);
     }

   public void paintComponent(Graphics g) 
    {
      g.drawImage(image,560,0,null);
    }
 }

