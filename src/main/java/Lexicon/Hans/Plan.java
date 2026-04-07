package Lexicon.Hans;

public enum Plan {
    FREE("Free", 0),
    BASIC("Basic", 100),
    PRO("Pro", 300);

    private final String subscription;
    private final int price;

    Plan(String subscription, int price) {
        this.subscription = subscription;
        this.price = price;
    }

    public String getSubscription() {
        return subscription;
    }

    public int getPrice() {
        return price;
    }
}