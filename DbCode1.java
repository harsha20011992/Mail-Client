import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
public class DbCode1 implements ActionListener
{	static String user;
	static int countin;
	String[] butin=new String[20];
	Connection con;
	JButton inbox[][];
	TextArea jt;
	JLabel jl,jl1;
	JButton jbtf;
	JButton jbtr;
	Statement st1,st2,st3,st4,st5;
	ResultSet rs1,rs2,rs3,rs4,rs5;
DbCode1(String a)
{
user=a;
}
DbCode1(int a,int b)
{
try
{			
                        Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        st1=con.createStatement();
  			ResultSet res = st1.executeQuery("SELECT * FROM  sen where to1='"+user+"'");	
  			while (res.next())
					 {
					System.out.println("inside DbCode1(int a,int b)");
  					String to1 = res.getString("to1");
  							if(to1.equals(user))
							{
							System.out.println("countin"+countin);
  							countin=countin+1;
							}
							}
							}
							catch(Exception ex)
									{
									System.out.println(ex);
									}
									}	

							DbCode1(int a,int b,int c)
							{
							System.out.println("inside DbCode1(int a,int b,int c)");
							JFrame frame=new JFrame("Inbox");
							frame.setSize(700,700);
  								frame.setVisible(true);	
							inbox=new JButton[countin][2];
							for(int i=0;i<countin;i++)
							{
							for(int k=0;k<2;k++)
							{

							inbox[i][k]=new JButton();
							}
							}  
							try
							{			
                       					 Class.forName("com.mysql.jdbc.Driver");
							con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harsha","root","thewall");
                        				st1=con.createStatement();
							ResultSet res1 = st1.executeQuery("SELECT * FROM  sen where to1='"+user+"' ");	
  							System.out.println("from " + "\t" + "to"+"\t"+"Subect"+"\t"+"body");
							System.out.println("countsent"+countin);
							
								  int y=40;int i=0,but=0;
								while(res1.next())
								{
									int x=20;
									y=y+50;

								String to2 = res1.getString("to1");
								if(to2.equals(user))
								{
								frame.setLayout(null);	
  								String from2= res1.getString("from1");
								inbox[i][0].setText(from2);
								inbox[i][0].setBounds(x,y,200,40);
								inbox[i][0].setVisible(true);
								inbox[i][0].addActionListener(this);
								frame.add(inbox[i][0]);
								System.out.println("\nbutoon to:"+inbox[i][0].getText());	
  								String subject1 = res1.getString("subject");
								String body1= res1.getString("body");
								butin[but]=body1;
								inbox[i][1].setText(subject1);
								inbox[i][1].setBounds(x+250,y,200,40);
								inbox[i][1].setVisible(true);
								inbox[i][1].addActionListener(this);
								frame.add(inbox[i][1]);
								System.out.println("\nbutoon to:"+inbox[i][1].getText());
								System.out.println(from2+"\t"+to2+"\t"+subject1+"\t"+body1);
								but=but+1;
   								}
								i++;
								}
								for(int k=0;k<countin;k++)
								{
								System.out.println("\nstring value"+butin[k]);
								}	
								jbtf=new JButton("");
								jbtf.setVisible(false);
		
									jbtf.addActionListener(this);
								jbtr=new JButton("");
								jbtr.setVisible(false);
		
									jbtr.addActionListener(this);
									}
									catch(Exception ex)
									{
									System.out.println(ex);
									}
			                                                }
								public void actionPerformed(ActionEvent ae1)
								{
								System.out.println("\ninside actionevent");
								for(int bosin=0;bosin<countin;bosin++)
								{	
								for(int bosin1=0;bosin1<2;bosin1++)
								{
								if(ae1.getSource()==inbox[bosin][bosin1])
								{
								/*JFrame frame1=new JFrame("BODY");
							        frame1.setSize(500,500);
  								frame1.setVisible(true);
								TextArea jt=new TextArea(butin[bosin]);
								jt.setBounds(100,100,300,300);
								frame1.add(jt);
								*/
								JFrame frame1=new JFrame("BODY");
							        frame1.setSize(700,700);
								frame1.setLayout(null);
  								frame1.setVisible(true);
								jbtf.setText("Forward");
								jbtr.setText("Reply");
								jt=new TextArea(butin[bosin]);
								jt.setBounds(100,100,200,200);
								jbtf.setBounds(100,500,150,20);
								jbtr.setBounds(300,500,150,20);
								frame1.add(jt);
								jl=new JLabel("FROM:");
								jl1=new JLabel(inbox[bosin][0].getText());
								jl.setBounds(100,50,100,20);
								jl1.setBounds(150,50,100,20);
								jbtf.setVisible(true);
								jbtr.setVisible(true);
								frame1.add(jbtr);
								frame1.add(jl);
								frame1.add(jl1);								frame1.add(jbtf);
								}
								}}
								if(ae1.getSource()==jbtf)
								{
								Compose calfor1 = new Compose("COMPOSE");
								calfor1.show();
								System.out.println("Hi");
								calfor1.setSize(700,700);
								calfor1.jt3.setText(jt.getText());
								System.out.println("Hi");
								}
								if(ae1.getSource()==jbtr)
								{
								Compose calfor2 = new Compose("COMPOSE");
								calfor2.show();
								calfor2.setSize(700,700);
								calfor2.jt2.setText(jl1.getText());
								System.out.println("Hi");
								}
                                                                }
								}