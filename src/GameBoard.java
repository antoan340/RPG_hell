
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class GameBoard extends JFrame implements MouseListener {
    public static final int TILE_SIDE_COUNT = 8;
    Drag drag = new Drag();

    GameBoard() {
        this.add(drag);
        setTitle("GPS");
        this.setSize(1000, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addMouseListener(this);

    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }


    @Override

    public void paint(Graphics g) {

        super.paint(g);
        Drag drag = new Drag();

        //GameTile tile = new GameTile(0, 0);
        //tile.render(g);
    }

    private void renderGamePiece(Graphics g, int row, int col) {
    }


    @Override
    public void mousePressed(MouseEvent e) {

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
    private int getBoardDimentionBasedOnCoordinates(int coordinates) {
        return coordinates / GameTile.TILE_SIZE;
    }

}