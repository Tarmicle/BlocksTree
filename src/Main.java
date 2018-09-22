public class Main {


    public static void main(String[] args) {
        VerticalBlock root =
                new VerticalBlock(
                        new HorizontalBlock(new Rect(4, 1), new Rect(4, 3)),
                        new HorizontalBlock(new Rect(1, 1), new HorizontalBlock(new Rect(1, 9), new Rect(1, 2))
                        ));


        //1 = +, 2 = -, 3 = |, 4 = ' '

        System.out.println("width" + root.width() + " height" + root.height());

        int bitmap[][] = new int[root.width()][root.height()];
        root.initBitMap().draw();
    }
}
