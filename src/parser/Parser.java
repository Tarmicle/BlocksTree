package parser;

public class Parser {/*

    private Tokenizer tokenizer;
    static int counter = 0;

    public Parser(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public BlockNode parse() {
        return verticalExpression(tokenizer.next());
    }

    BlockNode verticalExpression(Token next) {
        return recVerticalExpression(next, horizontalExpression(next));
    }

    BlockNode recVerticalExpression(Token next, BlockNode leftSon) {
        if (tokenizer.pick().getChars().equals("|")) {
            tokenizer.next();
            return new VerticalBlock(leftSon, recVerticalExpression(next, horizontalExpression(tokenizer.next())));
        } else return leftSon;
    }

    BlockNode horizontalExpression(Token next) {
        return recHorizontalExpression(next, primaryExpression(next));
    }

    BlockNode recHorizontalExpression(Token next, BlockNode leftSon) {
        if (tokenizer.pick().getChars().equals("-")) {
            tokenizer.next();
            return new HorizontalBlock(
                    leftSon,
                    recHorizontalExpression(next, primaryExpression(tokenizer.next())));
        } else return leftSon;
    }

    BlockNode primaryExpression(Token next) {
        if (next.getType() == Token.TYPE.NUMBER)
            return rectExpression(next);
        else return verticalExpression(tokenizer.next());
    }

    BlockNode rectExpression(Token next) {// token 5
        tokenizer.next();//*
        return new Rect(
                Integer.valueOf(next.getChars()),
                Integer.valueOf(tokenizer.next().getChars())//2
        );
    }*/

}
