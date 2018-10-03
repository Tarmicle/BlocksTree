package shapes;

public class BlockDrawer {
    private final int[][] bitMap;
    private final BlockNode root;

    BlockDrawer(BlockNode root) {
        this.root = root;
        this.bitMap = new int[root.width() + 1][root.height() + 1];
    }

    public void draw() {
        // shapes.Rect test =  new shapes.Rect(2,2);
        root.genBitmap(bitMap, 0, 0);
        paint(bitMap);
    }

    private static void paint(int[][] bitmap) {
        for (int y = 0; y < bitmap[0].length; y++) {
            for (int x = 0; x < bitmap.length; x++) {
                if (bitmap[x][y] == 3) {
                    System.out.print("+");
                } else if (bitmap[x][y] == 2)
                    System.out.print("|");
                else if (bitmap[x][y] == 1)
                    System.out.print("-");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
