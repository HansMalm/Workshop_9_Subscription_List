package Lexicon.Hans;

@FunctionalInterface
public interface SubscriberFilter {
    boolean matches(Subscriber subscriber);
}
