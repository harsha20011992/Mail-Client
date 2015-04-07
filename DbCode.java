import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
public class DbCode implements ActionListener
{	static String user;
	static int countsent;
	static String[] butset=new String[20]; 	
	Connection con;
	JButton j[][];
	static String bb; 
	TextArea jt;
	JLabel jl,jl1;
	Statement st1,st2,st3,st4,st5;
	ResultSet rs1,rs2,rs3,rs4,rs5;
	JButton jbtf;
	DbCode(String a,String b,String c,String d,String e,String f,String g,String h)
	{	
		try
		{
			                      
                        String sql=("insert into sign values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"')");
                        System.out.println(sql);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
			st1.executeUpdate(sql);
                        rs1=st1.executeQuery("select * from sign");
                        while(rs1.next())
                        {
                            System.out.println(rs1.getString(1)+" "+rs1.getString(2));
                        }
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		        Signup.k=10;

		}
	}
	DbCode(double a)
	{
                 try
		{
			                    
                        String sql=("select avatar from sign where username='"+user+"'");
                       
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
			
                        rs1=st1.executeQuery(sql);
                        if(rs1.next())
                        {
                         bb=rs1.getString(1);
                        }
                       
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		        

		}
	}

	DbCode(String a,double b)//avatar
	{

		try
		{       
			String updateString1;
                        updateString1 = ("update sign set avatar = '"+a+"' where username = '"+user+"'");
	
                        
			                      
                        Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
			st1.executeUpdate(updateString1);
                        
		}
		catch(Exception ex)
		{      
			System.out.println(ex);

		}
	}

	DbCode(String a,String b)
	{	user=a;
		try
		{
			                      
                        String sql=("select * from sign where username='"+a+"' and password='"+b+"'");
                       
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
			
                        rs1=st1.executeQuery(sql);
                        if(rs1.next())
                        {
                          Profile p=new Profile("PROFILE");
        		  p.show();
      			  p.setSize(700,700);  
                        }
                       else
                        {       
				Home gz=new Home("HOME");
                                gz.show();
                                gz.setSize(700,700);
				 
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		        

		}
	}
DbCode(String a,String b,String c)
	{
		try
		{           
                        String sql=("select * from sign where username='"+a+"' and forgot='"+c+"'and answer='"+b+"'");
                        Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement(); 
                        rs1=st1.executeQuery(sql);
			
                        if(rs1.next())
                        { 
                          Profile p=new Profile("PROFILE");
       			  p.show();
      			  p.setSize(700,700);
        
                        }
                       else
                        {      
				 Forget.y=10;   
				
			}
		}
		catch(Exception ex)
		{      
			System.out.println(ex);
		       

		}
	}
	
	
DbCode(String a)
	{

		try
		{
			String updateString1;
                        updateString1 = ("update sign set name = '"+a+"' where username = '"+user+"'");
	

			                      
                        Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
			st1.executeUpdate(updateString1);
                        /*if(rs1.next())
                        {
        				
                        }
                       else
                        {         
				
			}*/
		}
		catch(Exception ex)
		{      
			System.out.println(ex);

		}
	}
DbCode(String a,int b)
	{
		try
		{
			String updateString1;
                        updateString1 = ("update sign set password = '"+a+"' where username = '"+user+"'");
                        Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
			st1.executeUpdate(updateString1);
                       /* if(rs1.next())
                        { 
                         
                        }
                       else
                        {         	
			}*/
		}
		catch(Exception ex)
		{      
			System.out.println(ex);

		}
	}
DbCode(String a,String b,int c)
	{
		try
		{
			String updateString1;
                        updateString1 = ("update sign set forgot = '"+a+"',answer = '"+b+"' where username = '"+user+"'");
			//String updateString2 = ("update sign set answer = '"+b+"' where username = '"+user+"'");
                        Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
			st1.executeUpdate(updateString1);
			//st1.executeUpdate(updateString2);
		}
		catch(Exception ex)
		{      
			System.out.println(ex);

		}
	}
DbCode(String a,String b,String c,int d)
	{
		try
		{
			String sql=("insert into sen values('"+user+"','"+a+"','"+b+"','"+c+"')");
                        Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
			String sql2=("select * from sign where username='"+a+"'");
			rs1=st1.executeQuery(sql2);
			if(rs1.next())
			{
			st1.executeUpdate(sql);
			JOptionPane.showMessageDialog(null,"Mail Sent!!!");
			}
			else
			{
			JOptionPane.showMessageDialog(null,"Enter valid user name ");
			}
                }
		catch(Exception ex)
		{      
			System.out.println(ex);

		}
}
DbCode()
{
try
{			
                        Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
  			ResultSet res = st1.executeQuery("SELECT * FROM  sen");	
  			while (res.next())
					 {
  					String from1 = res.getString("from1");
  							if(from1.equals(user))
							{
  							countsent=countsent+1;
							}
							}
							}
							catch(Exception ex)
									{
									System.out.println(ex);
									}
									}
							DbCode(int a)
							{
							JFrame frame=new JFrame("Sent Items");
							frame.setSize(700,700);
  								frame.setVisible(true);
								//frame.setLayout(null);	
							/*JButton[][]*/ j=new JButton[countsent][2];
							for(int i=0;i<countsent;i++)
							{
							for(int k=0;k<2;k++)
							{

							j[i][k]=new JButton();
							}
							}  
							try
							{			
                       					 Class.forName("com.mysql.jdbc.Driver");
							con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        				st1=con.createStatement();
							ResultSet res1 = st1.executeQuery("SELECT * FROM  sen where from1='"+user+"' ");	
  							System.out.println("from " + "\t" + "to"+"\t"+"Subect"+"\t"+"body");
							System.out.println("countsent"+countsent);
							
								  int y=40;int i=0,but=0;
								while(res1.next())
								{
									int x=20;
									y=y+50;

								String from2 = res1.getString("from1");
								if(from2.equals(user))
								{
								frame.setLayout(null);	
  								String to2= res1.getString("to1");
								j[i][0].setText(to2);
								j[i][0].setBounds(x,y,200,40);
								j[i][0].setVisible(true);
								j[i][0].addActionListener(this);
								frame.add(j[i][0]);
								System.out.println("\nbutoon to:"+j[i][0].getText());	
  								String subject1 = res1.getString("subject");
								String body1= res1.getString("body");
								butset[but]=body1;
								j[i][1].setText(subject1);
								j[i][1].setBounds(x+250,y,200,40);
								j[i][1].setVisible(true);
								j[i][1].addActionListener(this);
								frame.add(j[i][1]);
								System.out.println("\nbutoon to:"+j[i][1].getText());
								System.out.println(from2+"\t"+to2+"\t"+subject1+"\t"+body1);
								but=but+1;
   								}
								i++;
								}
								for(int k=0;k<countsent;k++)
								{
								System.out.println("\nstring value"+butset[k]);
								}
								jbtf=new JButton("");
								jbtf.setVisible(false);
								jbtf.addActionListener(this);
	
									}
									catch(Exception ex)
									{
									System.out.println(ex);
									}
									
			                                                }
								public void actionPerformed(ActionEvent e)
								{
								int k=0;
								for(int bos=0;bos<countsent;bos++)
								{
								for(int bos1=0;bos1<2;bos1++)
								{
								if(e.getSource()==j[bos][bos1])
								{
								JFrame frame1=new JFrame("BODY");
							        frame1.setSize(700,700);
								frame1.setLayout(null);
  								frame1.setVisible(true);
								jbtf.setText("Forward");
								jt=new TextArea(butset[bos]);
								jt.setBounds(100,100,200,200);
								jbtf.setBounds(100,500,150,20);
								frame1.add(jt);
								jl=new JLabel("FROM:");
								jl1=new JLabel(j[bos1][0].getText());
								jl.setBounds(100,50,100,20);
								jl1.setBounds(150,50,100,20);
								jbtf.setVisible(true);
								frame1.add(jl);
								frame1.add(jl1);
;								frame1.add(jbtf);
								System.out.println("Hi");
								}
								}}
								if(e.getSource()==jbtf)
								{
								System.out.println("Hi");
								Compose calfor = new Compose("COMPOSE");
								calfor.show();
								calfor.setSize(700,700);
								calfor.jt3.setText(jt.getText());
								}
								}
}