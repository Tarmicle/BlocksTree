package tokenizer;


public class Token {
    TYPE type;
    String chars;

    public Token(String chars, TYPE type) {
        this.chars = chars;
        this.type = type;
    }

    public enum TYPE {
        NUMBER,
        SYMBOL,
        EOS
    }

    public TYPE getType() {
        return type;
    }

    public String getChars() {
        return chars;
    }

}
