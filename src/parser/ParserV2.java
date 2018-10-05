package parser;

import shapes.BlockNode;
import shapes.HorizontalBlock;
import shapes.Rect;
import shapes.VerticalBlock;
import tokenizer.Token;
import tokenizer.MockTokenizer;
import tokenizer.Tokenizer;

import java.io.IOException;

public class ParserV2 {

    private Tokenizer tokenizer;


    public ParserV2(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;


    }

    public BlockNode parse() throws IOException {
        BlockNode blockNode = verticalExpression();
        if (!tokenizer.next().isTypeOf(Token.TYPE.EOS)) throw new IllegalArgumentException();
        return blockNode;
    }

    BlockNode verticalExpression() throws IOException {
        BlockNode leftSon = horizontalExpression();
        while (tokenizer.pick().isTypeOf(Token.TYPE.VLINE)) {
            tokenizer.next();
            leftSon = new VerticalBlock(leftSon, horizontalExpression());
        }
        return leftSon;
    }

    private BlockNode horizontalExpression() throws IOException {
        BlockNode leftSon = primaryExpression();
        while (tokenizer.pick().isTypeOf(Token.TYPE.HLINE)) {
            tokenizer.next();
            leftSon = new HorizontalBlock(leftSon, primaryExpression());
        }
        return leftSon;
    }

    private BlockNode primaryExpression() throws IOException {
        if (tokenizer.pick().isTypeOf(Token.TYPE.LPARENTHESIS))
            return parentExpression();
        return rectExpression();
    }

    private BlockNode parentExpression() throws IOException {
        if (!tokenizer.next().isTypeOf(Token.TYPE.LPARENTHESIS)) throw new IllegalArgumentException();
        BlockNode rtn = verticalExpression();
        if (!tokenizer.next().isTypeOf(Token.TYPE.RPARENTHESIS)) throw new IllegalArgumentException();
        return rtn;
    }

    private BlockNode rectExpression() throws IOException {
        Token n1 = tokenizer.next();
        tokenizer.next();
        Token n2 = tokenizer.next();
        System.out.println(n2.getNum());
        return new Rect(n1.getNum(), n2.getNum());
    }


}

