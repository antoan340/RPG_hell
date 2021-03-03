import javax.swing.*;
import java.awt.Point;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Drag extends JPanel {
    ImageIcon image = new ImageIcon("image.png");
    final int width = image.getIconWidth();
    final int height = image.getIconHeight();
    Point imageCorner;
    Point imageSecondPoint;
    public Drag(){
        imageCorner = new Point(800,200);
        click press = new click();
        dragLisener drag = new dragLisener();
        this.addMouseListener(press);
        this.addMouseMotionListener(drag);
    }
    public void paint(Graphics g){
        super.paint(g);
        image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }
    private class click extends MouseAdapter{
        public void mousePressed(MouseEvent e) {
            imageSecondPoint = e.getPoint();
        }
    }
    private class dragLisener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            imageCorner.translate(
                    (int)(currentPt.getX() - imageSecondPoint.getX()),
                    (int)(currentPt.getY() - imageSecondPoint.getY())
            );
            imageSecondPoint = currentPt;
            repaint();
        }
    }
}
