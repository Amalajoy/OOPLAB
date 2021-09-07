import java.applet.Applet;
import java.awt.*;
public class Shapes extends Applet
{
  public void paint(Graphics g)
{
  g.drawLine(25,25,140,25);
 
  g.setColor(Color.green);
  g.fillRect(25,40,100,50);
  g.drawRect(265,40,50,50);  
        
  g.setColor(Color.red);
  g.fillRoundRect(25,125,100,50,15,15);     

  g.drawOval(25,205,100,50);
  g.setColor(Color.yellow);
  g.fillOval(265,205,70,70); 
			
  int xPoints[] = {250,320,170,250};
  int yPoints[] = {100,150,150,100};
			  
  g.setColor(Color.blue);
  g.fillPolygon(xPoints, yPoints, 3);
  g.drawArc(150,350,100,50,25,75);
	
}
}

/* <applet code = "Shapes" height = 500 width =500>  
   </applet> */
