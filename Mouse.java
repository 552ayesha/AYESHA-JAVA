import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Mouse"width=300 height=100>
</applet>*/
public class Mouse extends Applet implements MouseListener,MouseMotionListener
{
String msg=" ";
int mouseX=10,mouseY=20;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
mouseX=10;
mouseY=20;
msg="MouseClicked";
repaint();
}
public void mouseEntered(MouseEvent me)
{
mouseX=10;
mouseY=20;
msg="MouseEntered";
repaint();
}
public void mouseExited(MouseEvent me)
{
mouseX=10;
mouseY=20;
msg="MouseExited";
repaint();
}
public void mousePressed(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Down";
repaint();
}
public void mouseReleased(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="Up";
repaint();
}
public void mouseDragged(MouseEvent me)
{
mouseX=me.getX();
mouseY=me.getY();
msg="*";
showStatus("Dragging mouse at"+mouseX+","+mouseY);
repaint();
}
public void mouseMoved(MouseEvent me)
{
showStatus("Moving mouse at"+me.getX()+","+me.getY());
}
public void paint(Graphics g)
{
g.drawString(msg,mouseX,mouseY);
}
}
