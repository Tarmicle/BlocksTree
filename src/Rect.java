public class Rect extends BlockNode {
    private final int width;
    private final int height;
    private int lineToDraw = 0;

    Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int width() {
        return this.width;
    }

    @Override
    public int height() {
        return this.height;
    }


    @Override
    public void draw() {

    }

    protected void genBitmap(int[][] bitmap, int x, int y) {

        bitmap[x][y] = 3;
        for (int i = 0; i < width(); i++) {
            bitmap[x + 1 + i][y] = 1;
        }
        bitmap[x + width() + 1][y] = 3;

        for (int i = 0; i < height(); i++) {
            bitmap[x][y + 1 + i] = 2;
            bitmap[x + 1 + width()][y + 1 + i] = 2;
        }

        bitmap[x][y+height()+1] = 3;
        for (int i = 0; i < width(); i++) {
            bitmap[x+1+i][y + height() + 1] = 1;
        }
        bitmap[x+ 1 + width()][y+1+height()] = 3;


    }
}
