public class Main {

    static void draw(int[][] bitmap) {
        for (int y = 0; y < bitmap[0].length; y++) {
            for (int x = 0; x < bitmap.length; x++) {
                if (bitmap[x][y] == 1)
                    System.out.print("X");
                if (bitmap[x][y] == 0)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        VerticalBlock root =
                new VerticalBlock(
                        new HorizontalBlock(new Rect(4, 1),new Rect(4, 3)),
                        new HorizontalBlock(new Rect(1, 1),new Rect(1, 2))
                );


        //1 = +, 2 = -, 3 = |, 4 = ' '

        System.out.println("width"+root.width()+" height"+root.height());
        int bitmap[][] = new int[root.width()][root.height()];
        root.genBitmap(bitmap, 0, 0);
        draw(bitmap);
    }
}
