package tokenizer;

import java.io.IOException;
import java.io.Reader;

public class MockTokenizer {
    private final Reader reader;
    int i = 0;

    private Token[] arrayOfTokens = {
            new Token(3, Token.TYPE.NUMBER),
            new Token(Token.TYPE.SYMBOL),
            new Token(10, Token.TYPE.NUMBER),
            new Token(Token.TYPE.HLINE),
            new Token(3, Token.TYPE.NUMBER),
            new Token(Token.TYPE.SYMBOL),
            new Token(3, Token.TYPE.NUMBER),
            new Token(Token.TYPE.HLINE),
            new Token(3, Token.TYPE.NUMBER),
            new Token(Token.TYPE.SYMBOL),
            new Token(3, Token.TYPE.NUMBER),
            new Token(Token.TYPE.EOS)
    };

    MockTokenizer(Reader reader) throws IOException {
        this.reader = reader;
    }

    public Token next() {
        return arrayOfTokens[i++];
    }

    public Token pick() {
        return arrayOfTokens[i];
    }
}
