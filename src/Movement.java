import java.awt.*;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Movement implements MouseListener, MouseMotionListener {
    private int x,y;
    public Movement(Component... pns){
        for(Component panel : pns) {
            panel.addMouseListener(this);
            panel.addMouseMotionListener(this);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent event) {
        x = event.getX();
        y = event.getX();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent event) {
        event.getComponent().setLocation(event.getX()+event.getComponent().getX()-x,event.getY()+event.getComponent().getY()-y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
