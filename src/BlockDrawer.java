public class BlockDrawer {
    private final int[][] bitMap;
    private final BlockNode root;

    BlockDrawer(BlockNode root) {
        this.root = root;
        this.bitMap = new int[20][20];
    }

    public void draw() {
        // Rect test =  new Rect(2,2);
        root.genBitmap(bitMap, 0, 0);
        paint(bitMap);
    }

    private static void paint(int[][] bitmap) {
        for (int y = 0; y < bitmap[0].length; y++) {
            for (int x = 0; x < bitmap.length; x++) {
                if (bitmap[x][y] == 3)
                    if ((y == 0) && (x == 0)) System.out.print("┌");
                    else if (y == 0) {
                        if(bitmap[x + 1][y] == 0) System.out.print("┐");
                        else System.out.print("┬");
                    } else System.out.print("┼");
                if (bitmap[x][y] == 2)
                    System.out.print("│");
                if (bitmap[x][y] == 1)
                    System.out.print("─");
                if (bitmap[x][y] == 0)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
