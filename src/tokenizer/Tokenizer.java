package tokenizer;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;

public class Tokenizer {
    int i = 0;
    private Token[] arrayOfTokens = {
            new Token("3", Token.TYPE.NUMBER),
            new Token("*", Token.TYPE.SYMBOL),
            new Token("3", Token.TYPE.NUMBER),
            new Token("-", Token.TYPE.SYMBOL),
            new Token("3", Token.TYPE.NUMBER),
            new Token("*", Token.TYPE.SYMBOL),
            new Token("3", Token.TYPE.NUMBER),
            new Token("-", Token.TYPE.SYMBOL),
            new Token("1", Token.TYPE.NUMBER),
            new Token("*", Token.TYPE.SYMBOL),
            new Token("3", Token.TYPE.NUMBER),
            new Token("-", Token.TYPE.SYMBOL),
            new Token("1", Token.TYPE.NUMBER),
            new Token("*", Token.TYPE.SYMBOL),
            new Token("7", Token.TYPE.NUMBER),
            new Token("|", Token.TYPE.SYMBOL),
            new Token("2", Token.TYPE.NUMBER),
            new Token("*", Token.TYPE.SYMBOL),
            new Token("4", Token.TYPE.NUMBER),
            new Token("|", Token.TYPE.SYMBOL),
            new Token("1", Token.TYPE.NUMBER),
            new Token("*", Token.TYPE.SYMBOL),
            new Token("5", Token.TYPE.NUMBER),
            new Token("|", Token.TYPE.SYMBOL),
            new Token("2", Token.TYPE.NUMBER),
            new Token("*", Token.TYPE.SYMBOL),
            new Token("4", Token.TYPE.NUMBER),
            new Token("-", Token.TYPE.SYMBOL),
            new Token("1", Token.TYPE.NUMBER),
            new Token("*", Token.TYPE.SYMBOL),
            new Token("5", Token.TYPE.NUMBER),
            new Token("0", Token.TYPE.EOS)
    };

    public Token next() {
        return arrayOfTokens[i++];
    }

    public Token peek() {
        return arrayOfTokens[i];
    }
}
