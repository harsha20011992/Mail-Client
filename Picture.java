import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Picture extends JPanel
 {

   Image image;

   public Picture(Image img) 
     {
      image = img;
      setSize(300,300);
      setLayout(null);
     }

   public void paintComponent(Graphics g) 
    {
      g.drawImage(image,0,0,null);
    }
 }