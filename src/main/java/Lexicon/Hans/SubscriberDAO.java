package Lexicon.Hans;

import java.util.ArrayList;

public class SubscriberDAO {

    private ArrayList<Subscriber> subscriberList = new ArrayList<>();

    public void save (Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public ArrayList<Subscriber> findAll () {
        return subscriberList;
    }

    public Subscriber findByID (int id) {
        Subscriber returnSubscriber = new Subscriber(id, "empty", Plan.FREE, false, 0);
        for (Subscriber subscriber : subscriberList) {
            if (id == subscriber.getId()) {
                returnSubscriber = subscriber;
            }
        }
        return returnSubscriber;
    }
}