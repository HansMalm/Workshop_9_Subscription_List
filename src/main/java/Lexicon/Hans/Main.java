package Lexicon.Hans;


public class Main {
    static void main() {

        SubscriberDAO subscriberDAO = new SubscriberDAO();
        SubscriberProcessor processor = new SubscriberProcessor();

        //Sample Data
        subscriberDAO.save(new Subscriber(100, "ada@mail.com", Plan.FREE, false, 0));
        subscriberDAO.save(new Subscriber(101, "bob@mail.com", Plan.BASIC, false, 0));
        subscriberDAO.save(new Subscriber(102, "cic@mail.com", Plan.PRO, true, 3));
        subscriberDAO.save(new Subscriber(103, "dad@mail.com", Plan.FREE, true, 1));
        subscriberDAO.save(new Subscriber(104, "eke@mail.com", Plan.BASIC, true, 1));
        subscriberDAO.save(new Subscriber(105, "fxf@mail.com", Plan.PRO, true, 4));

        //Workshop Part 1 add business rules
        SubscriberFilter isActive = subscriber -> subscriber.isActive();
        SubscriberFilter isExpiring = subscriber -> subscriber.getMonthsRemaining() <= 1;
        SubscriberFilter isActiveExpiring = subscriber -> isActive.matches(subscriber)
                && isExpiring.matches(subscriber);
        SubscriberFilter byPlan = subscriber -> subscriber.getPlan();
        SubscriberFilter isPaying = subscriber -> ;

        SubscriberAction extendSub = subscriber -> subscriber
                .setMonthsRemaining(subscriber.getMonthsRemaining() + 1);
        SubscriberAction deactivate = subscriber -> subscriber.setActive(false);
    }
}