package Lexicon.Hans;

public class Subscriber {
    int id;
    String email;
    Plan plan;
    boolean active;
    int monthsRemaining;

    public Subscriber(int id, String email, Plan plan, boolean active, int monthsRemaining) {
        this.id = id;
        this.email = email;
        this.plan = plan;
        this.active = active;
        this.monthsRemaining = monthsRemaining;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Plan getPlan() {
        return plan;
    }

    public boolean isActive() {
        return active;
    }

    public int getMonthsRemaining() {
        return monthsRemaining;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setMonthsRemaining(int monthsRemaining) {
        this.monthsRemaining = monthsRemaining;
    }
}