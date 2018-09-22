public class VerticalBlock extends BlockNode {
    BlockNode top, bottom;

    VerticalBlock(BlockNode top, BlockNode bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public int width() {
        return Math.max(top.width(), bottom.width());
    }

    @Override
    public int height() {
        return top.height() + bottom.height();
    }

    @Override
    public void draw() {
        for (int i = 0; i < top.height() + 2; i++) {
            top.draw();
            System.out.println();
        }
        bottom.draw();
    }

    @Override
    public void genBitmap(int[][] bitmap, int x, int y) {
        top.genBitmap(bitmap, x, y);
        bottom.genBitmap(bitmap, x, y + top.height());
    }

}
