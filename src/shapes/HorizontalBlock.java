package shapes;

public class HorizontalBlock extends BlockNode {
    BlockNode left;
    BlockNode right;

    public HorizontalBlock(BlockNode left, BlockNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int width() {
        return left.width() + right.width() ;
    }

    @Override
    public int height() {
        return Math.max(left.height(), right.height()) ;
    }

    @Override
    public void draw() {
        left.draw();
        right.draw();
    }

    @Override
    protected void genBitmap(int[][] bitmap, int x, int y) {
        left.genBitmap(bitmap, x, y);
        right.genBitmap(bitmap, x + left.width(), y);
    }

}
