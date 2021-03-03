import java.awt.*;

public class GameTile {
    public static final int TILE_SIZE = 50;
    /**
     *
     * @author Antoan
     * @param "Създавам си цвят"
     */
    private static Color orange=new Color(255,165,0);

    private int row;
    private int col;
    private int tileSize;

    /**
     *
     * @author Antoan
     * @param "Инициализиране на стойностите за игралната плочка"
     */
    public GameTile(int row, int col) {

        this.row        = row;
        this.col        = col;
        this.tileSize   = 80;
    }
    /**
     *
     * @author Antoan
     * @param "Обединяване на 2та метода за визоализиране в едно"
     */
    public void render(Graphics g){
        RenderCubes(g);
        RenderBorders(g);

    }
    /**
     *
     * @author Antoan
     * @param "Визоализиране на квадратите и на кръгчето в центъра на полето"
     */
    public void RenderCubes(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(10,31,720,560);
        g.setColor(Color.GRAY);
        g.fillRect(10,191,720,240);
        g.setColor(Color.RED);
        int redCounterUp=0,redCounterDown=-1;
        for (int i=10; i<730; i+=80){
            for (int j=31;j<191; j+=80) {
                if (redCounterUp==3||redCounterUp==0)
                    g.fillRect(i, j, 80, 80);
                if(redCounterUp==3)
                    redCounterUp=-1;
                redCounterUp++;
            }
            for (int j=431;j<591; j+=80) {
                if (redCounterDown==1||redCounterDown==0)
                    g.fillRect(i, j, 80, 80);
                if(redCounterDown==2)
                    redCounterDown=-2;
                redCounterDown++;
            }
        }
    }
    /**
     *
     * @author Antoan
     * @param "Визуализиране на решетката на полето"
     */
    public void RenderBorders(Graphics g){
        g.setColor(Color.black);
        for (int i=31; i<=591 ;i+=80){
            for(int j=8;j<=728;j+=80){
                if(j<728&&i<591) {
                    g.fillRect(j, i, 2, 80);
                    g.fillRect(j, i, 80, 2);
                }
                if(j==728&&i<591){
                    g.fillRect(j, i, 2, 82);
                }
                if(j<728&&i==591){
                    g.fillRect(j, i, 82, 2);
                }

            }
        }
    }
}