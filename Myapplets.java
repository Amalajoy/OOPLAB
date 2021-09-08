import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Myapplets extends Applet implements MouseListener, MouseMotionListener
{
    String str = "";
    public void init()
    {   setBackground(Color.yellow );
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        str = "Mouse Clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
        str = "Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent e)
    {
        str = "Mouse Exited";
        repaint();
    }
    public void mousePressed(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        showStatus("Mouse pressed at coordinates (" + x + "," + y + ")");
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        showStatus("Mouse released at coordinates (" + x + "," + y + ")");
        repaint();
    }
    public void mouseMoved(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        showStatus("Mouse currently at (" + x + "," + y + ")");
        repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();
        showStatus("Mouse dragged at (" + x + "," + y + ")");
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(str,100,100);
    }
}
/*
<applet code = "Myapplets" height ="400" width = "400"></applet>
 */