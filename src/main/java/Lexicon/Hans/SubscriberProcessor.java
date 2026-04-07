package Lexicon.Hans;

import java.util.ArrayList;

public class SubscriberProcessor {
    public ArrayList<Subscriber> findSubscribers (ArrayList<Subscriber> list, SubscriberFilter filter) {
        ArrayList<Subscriber> resultList = new ArrayList<>();
        return resultList;
    }

    public ArrayList<Subscriber> applyToMatching (ArrayList<Subscriber> list,
                                                  SubscriberFilter filter, SubscriberAction action) {
        ArrayList<Subscriber> appliedList = new ArrayList<>();
        return appliedList;
    }
}
