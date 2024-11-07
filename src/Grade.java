public class Grade {

    private Assignment assignment;

    private Course course;

    private Subject subject;

    private int gradeValue;

    public Grade(Assignment assignment, Course course, Subject subject, int gradeValue) {
        this.assignment = assignment;
        this.course = course;
        this.subject = subject;
        this.gradeValue = gradeValue;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(int gradeValue) {
        this.gradeValue = gradeValue;
    }
}
