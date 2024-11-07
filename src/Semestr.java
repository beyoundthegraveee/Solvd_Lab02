import java.util.Date;

public class Semestr {

    private Date startDate;

    private Date endDate;

    private int semester;

    private Course course;

    private Subject [] subjects;

    public Semestr(Date startDate, Date endDate, int semester, Course course, Subject[] subjects) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.semester = semester;
        this.course = course;
        this.subjects = subjects;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}
