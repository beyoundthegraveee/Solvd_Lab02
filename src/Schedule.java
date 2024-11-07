import java.util.Date;

public class Schedule {

    private String [] daysOfWeek;

    private int [] hours;

    private Date startDate;

    private Date endDate;

    private Classroom classroom;

    public Schedule(String[] daysOfWeek, int[] hours, Date startDate, Date endDate, Classroom classroom) {
        this.daysOfWeek = daysOfWeek;
        this.hours = hours;
        this.startDate = startDate;
        this.endDate = endDate;
        this.classroom = classroom;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public int[] getHours() {
        return hours;
    }

    public void setHours(int[] hours) {
        this.hours = hours;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
