import java.awt.*;
    /**
     *
     * @author Antoan
     * @param "Пазача наследява стойностите на фигурата"
     */
    public class Knight extends Figure {
        public Color color;
        /**
         * @param "Задаване на параметри на играч"
         * @author Antoan
         */
        public Knight(int row, int col, Color color) {
            super();
            this.row = row;
            this.col=col;
            this.color=color;
        }
        /**
         *
         * @author Antoan
         * @param "Визуализиране на играча"
         */
        public void render(Graphics g) {
            int x = this.col * GameTile.TILE_SIZE;
            int y = this.row * GameTile.TILE_SIZE;
            g.setColor(this.color);
            g.fillRect(x+10, y+33, 48, 48);

        }
        /**
         *
         * @author Antoan
         * @param "движението на играча"
         */
        public void move(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }