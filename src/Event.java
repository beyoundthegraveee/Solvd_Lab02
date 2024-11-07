import java.security.PrivateKey;
import java.util.Date;

public class Event {

    private String eventName;

    private Date date;

    private String location;

    private Person organizer;

    public Event(String eventName, Date date, String location, Person organizer) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.organizer = organizer;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Person organizer) {
        this.organizer = organizer;
    }
}
