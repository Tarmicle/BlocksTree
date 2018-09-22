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

    public void genBitmap(int[][] bitmap, int x, int y) {
        for (int i = 0; i < width(); i++) {
            for (int l = 0; l < height(); l++) {
                bitmap[x+i][y+l] = 1;
            }
        }
    }
}
