package shapes;

public class Rect extends BlockNode {
    private final int width;
    private final int height;
    private int lineToDraw = 0;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int width() {
        return this.width + 1;
    }

    @Override
    public int height() {
        return this.height + 1;
    }


    @Override
    public void draw() {

    }

    protected void genBitmap(int[][] bitmap, int x, int y) {

        bitmap[x][y] = 3;
        for (int i = 0; i < width(); i++) {
            if (bitmap[x + i + 1][y] != 3)
                bitmap[x + i + 1][y] = 1;
        }
        bitmap[x + width()][y] = 3;

        for (int i = 0; i < height(); i++) {
            if (bitmap[x][y + 1 + i] != 3)
                bitmap[x][y + 1 + i] = 2;
            if (bitmap[x + width()][y + 1 + i] != 3)
                bitmap[x + width()][y + 1 + i] = 2;
        }

        bitmap[x][y + height()] = 3;
        for (int i = 0; i < width(); i++) {
            if (bitmap[x + 1 + i][y + height()] != 3)
                bitmap[x + 1 + i][y + height()] = 1;
        }
        bitmap[x + width()][y + height()] = 3;


    }
}
