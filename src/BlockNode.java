public abstract class BlockNode {
    public abstract int width();
    public abstract  int height();

    public int area(){
        return width()*height();
    }
    public abstract void draw();

    public abstract void genBitmap(int[][] bitmap,int x,int y);
}
