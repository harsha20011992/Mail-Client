import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Background extends JPanel
 {

   Image image;

   public Background(Image img) 
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