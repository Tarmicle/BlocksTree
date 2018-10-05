package tokenizer;

import java.io.IOException;
import java.io.Reader;

public class Tokenizer {
    private final Reader reader;
    Token actual;

    public Tokenizer(Reader reader) {
        this.reader = reader;
    }


    public Token next() throws IOException {
        Token rtn = actual;
        actual = getNext();
        return rtn;
    }

    public Token pick() throws IOException {
        if (actual == null)
            actual = getNext();
        return actual;
    }

    Token getNext() throws IOException {
        int readResult = reader.read();
        if (readResult == -1) {
            return new Token(Token.TYPE.EOS);
        } else if ('0' <= readResult && readResult <= '9') {
            StringBuilder intBuilder = new StringBuilder();
            do {
                intBuilder.append(readResult - '0');
                reader.mark(1);
                readResult = reader.read();
            } while ('0' <= readResult && readResult <= '9');
            System.out.println("Dimensioni: " + intBuilder.toString());
            reader.reset();
            return new Token(Integer.valueOf(intBuilder.toString()), Token.TYPE.NUMBER);
        } else if (readResult == '*') {
            return new Token(Token.TYPE.SYMBOL);
        } else if (readResult == '-') {
            return new Token(Token.TYPE.HLINE);
        } else if (readResult == '|')
            return new Token(Token.TYPE.VLINE);
        else if (readResult == '(')
            return new Token(Token.TYPE.LPARENTHESIS);
        else if (readResult == ')') {
            return new Token(Token.TYPE.RPARENTHESIS);
        } else return new Token(Token.TYPE.EOS);
    }
}
