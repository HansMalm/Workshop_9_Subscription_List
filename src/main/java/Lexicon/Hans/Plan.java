package Lexicon.Hans;

public enum Plan {
    FREE(0),
    BASIC(100),
    PRO(300);

    private final int price;

    Plan( int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}