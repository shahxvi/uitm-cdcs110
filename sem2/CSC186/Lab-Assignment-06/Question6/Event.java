public abstract class Event {
    private String eventName;
    protected String date;

    public Event() {
        eventName = "";
        date = "";
    }

    public Event(String eventName, String date) {
        this.eventName = eventName;
        this.date = date;
    }

    public Event(Event other) {
        this.eventName = other.eventName;
        this.date = other.date;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDate() {
        return date;
    }

    public abstract double calcPayment();

    public String toString() {
        return "Event Name: " + eventName +
               "\nDate: " + date;
    }
}
