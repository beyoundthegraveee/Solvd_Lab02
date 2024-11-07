import java.util.Date;

public class Exam {

    private Subject subject;

    private Date date;

    private int duration;

    private String location;

    public Exam(Subject subject, Date date, int duration, String location) {
        this.subject = subject;
        this.date = date;
        this.duration = duration;
        this.location = location;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
