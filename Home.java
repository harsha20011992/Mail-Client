import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener

{  
  String ava1="pics/1.jpg";
  Background bag = new Background(new ImageIcon("images/home.jpg").getImage());//to set background
    // Picture pic1 = new Picture(new ImageIcon(ava1).getImage());//just an example to add image
     JButton loginb;
     JLabel sign;
     JLabel userl;
     JLabel passl;
     JTextField t;
     JPasswordField t1;
      
				
     JButton signupb;
     JButton forgotb;
    // JLabel loginm;  //public because used in another class(mouse action listener)
    // JLabel signupm;  
    // JLabel forgotm;
			
	public Home(String str)
    {   
        super(str);
        setLayout(null);
        loginb=new JButton("Login");
	loginb.setToolTipText("Click Here To Login");
        forgotb=new JButton("Forgot Your Password?");
        userl=new JLabel("Username");
        passl=new JLabel("Password");
        DbCode avatar=new DbCode(8.8);
        t=new JTextField(20);
	//t.addMouseListener(new MyMouseListener3());
        //t.setText("username");
	t1=new JPasswordField(20);
	//t1.setText("Enter your password");
	//t1.addMouseListener(new MyMouseListener4());
	sign=new JLabel("New to BlueFalcon?");
	//loginm=new JLabel("");
	//signupm=new JLabel("");
        //forgotm=new JLabel("");
        signupb=new JButton("Signup");	
	//signupb.addMouseListener(new MyMouseListener1()); 
        loginb.setBounds(400,400,100,30);
	//loginm.setBounds(400,440,300,20);
	//loginb.addMouseListener(new MyMouseListener());
        signupb.setBounds(470,20,100,30);
	//signupm.setBounds(470,50,200,20);//mouseaction listener label
        sign.setBounds(350,20,200,30);
        userl.setBounds(400,150,100,20);
        passl.setBounds(400,250,100,20);
	//le.setBounds(400,300,200,30);
        t.setBounds(390,170,200,30);
        t1.setBounds(390,270,200,30);
        forgotb.setBounds(300,500,300,30);
        //forgotb.addMouseListener(new MyMouseListener2());
	//forgotm.setBounds(300,540,500,20);
	signupb.addActionListener(this);
	loginb.addActionListener(this);
 	forgotb.addActionListener(this);
        add(userl);
        add(passl);
        add(loginb);
        add(signupb);
        add(t);
        add(t1);
        add(sign);
        add(forgotb);
	//add(loginm);
	//add(signupm);
	//add(forgotm);
	Font font = new Font("Verdana", Font.BOLD, 12);
        userl.setFont(font);
        userl.setForeground(Color.WHITE); // used for font setting
	passl.setForeground(Color.WHITE);
	sign.setForeground(Color.WHITE);
       // add (pic1);//first add is topmost
       	add(bag);
    }


/*class MyMouseListener extends MouseAdapter{
  	public void mouseEntered(MouseEvent me){
	if(loginm.getText()=="")
{	
	loginm.setForeground(Color.WHITE);
  	loginm.setText("click here to login");
	loginb.setForeground(Color.RED);
  }
}
   	public void mouseExited(MouseEvent me){
  	loginm.setText("");
	loginb.setForeground(Color.BLACK);
}
}

class MyMouseListener1 extends MouseAdapter{
  	public void mouseEntered(MouseEvent me){
	if(signupm.getText()=="")
{
	signupm.setForeground(Color.WHITE);
  	signupm.setText("click here to signup");
	signupb.setForeground(Color.RED);  
}
}
   	public void mouseExited(MouseEvent me){
  	signupm.setText("");
	signupb.setForeground(Color.BLACK);
}
}

class MyMouseListener2 extends MouseAdapter{
  	public void mouseEntered(MouseEvent me){
	if(forgotm.getText()=="")
{
		forgotm.setForeground(Color.WHITE);
  	forgotm.setText("click here to retrieve your password");
	forgotb.setForeground(Color.RED); 
	 
}
}
   	public void mouseExited(MouseEvent me){
  	forgotm.setText("");
	forgotb.setForeground(Color.BLACK);
}
}

class MyMouseListener3 extends MouseAdapter{
  	public void mouseClicked(MouseEvent me){
	t.setText("");
}
}

class MyMouseListener4 extends MouseAdapter{
  	public void mouseClicked(MouseEvent me){
	t1.setText("");
	t1.setEchoChar('*');
}
}*/

    public void actionPerformed(ActionEvent ae)
    {
     if(ae.getSource()==signupb)
      {dispose();
        Signup s=new Signup("Signup");
        s.show();
        s.setSize(700,700);
      }
     if(ae.getSource()==forgotb)
      {
        dispose();
        Forget s=new Forget("Forgot Password");
        s.show();
        s.setSize(700,700);
      }
     
     if(ae.getSource()==loginb)
      {
	String u=t.getText(),v=t1.getText();
          
	  DbCode db1=new DbCode(u,v);
	  DbCode1 dbinbo=new DbCode1(u);
          dispose();
          
      }
      
     }

    public static void main(String[] args) 
    {
        Home gz=new Home("HOME");
        gz.show();
        gz.setSize(700,700);
        
    }

}