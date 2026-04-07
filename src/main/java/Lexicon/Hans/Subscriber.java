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

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMonthsRemaining() {
        return monthsRemaining;
    }

    public void setMonthsRemaining(int monthsRemaining) {
        this.monthsRemaining = monthsRemaining;
    }
}