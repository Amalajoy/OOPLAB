import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class House extends Applet implements ActionListener
{
 Button b1,b2;
 Label b;
 String str;
public void init()
 {
   b1 = new Button("Red");    
   b2 = new Button("Blue");
     add(b1);                  
     add(b2);
   b1.addActionListener(this); 
   b2.addActionListener(this);
  }

public void actionPerformed(ActionEvent ae)
 {
  str = ae.getActionCommand();
  repaint();      
 }

public void paint(Graphics g)
    { 	int [] x = {150, 380, 225};
	int [] y = {150, 150, 45};
	   
	 g.setColor(Color.orange);
	 g.fillRect(150, 150, 230, 200);
         g.setColor(Color.blue);
	 g.fillRect(220, 200, 100, 150);
	 g.setColor(Color.black);
	 g.fillPolygon(x, y, 3);
   if(str.equals("Red"))
     {
	g.setColor(Color.orange);
	g.fillRect(150, 150, 230, 200);
        g.setColor(Color.red);
	g.fillRect(220, 200, 100, 150);
	g.setColor(Color.black);
	g.fillPolygon(x, y, 4);
     }
   if(str.equals("Blue"))
     {
	g.setColor(Color.orange);
	g.fillRect(150, 150, 230, 200);
        g.setColor(Color.blue);
	g.fillRect(220, 200, 100, 150);
	g.setColor(Color.black);
	g.fillPolygon(x, y, 4);
     }
    }
}
/*<APPLET code="House.class" width="1000" height="1000"></APPLET>*/