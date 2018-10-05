package tokenizer;


import java.util.Objects;

public class Token {
    // CARATTERI TERMINATORI
    TYPE type;
    int num;

    protected Token(int num, TYPE type) {
        this.num = num;
        this.type = type;
    }

    protected Token(TYPE type) {
        this(0,type);
    }

    public boolean isTypeOf(TYPE lparenthesis) {
        return  lparenthesis == this.type;
    }

    public enum TYPE {
        NUMBER,
        VLINE,
        HLINE,
        SYMBOL,
        LPARENTHESIS,
        RPARENTHESIS, EOS
    }

    public TYPE getType() {
        return type;
    }

    public int getNum() {
        if (!isTypeOf(TYPE.NUMBER)) throw new IllegalArgumentException();
        return num;
    }



}
