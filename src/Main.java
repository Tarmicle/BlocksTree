import parser.ParserV2;
import shapes.HorizontalBlock;
import shapes.Rect;
import shapes.VerticalBlock;
import tokenizer.MockTokenizer;
import tokenizer.Tokenizer;

import java.io.IOException;
import java.io.StringReader;

public class Main {


    public static void main(String[] args) throws IOException {


        Tokenizer t = new Tokenizer( new StringReader("4*3-2*2-(2*2|3*2)"));
        new ParserV2(t).parse().initBitMap().draw();
        System.out.println("--------------------------");
        new VerticalBlock(
                new HorizontalBlock(
                        new HorizontalBlock(
                                new Rect(3, 4),
                                new Rect(2, 2)),
                        new Rect(1, 1)),
                new VerticalBlock(
                        new Rect(4, 5),
                        new HorizontalBlock(
                                new Rect(3, 4), new Rect(1, 5))))
                .initBitMap().draw();
        //1 = +, 2 = -, 3 = |, 4 = ' '
    }
}
