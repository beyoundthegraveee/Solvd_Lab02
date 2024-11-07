public class Student extends Person {

    private String studentID;

    public Student(String name, String surname, int age, String studentID) {
        super(name, surname, age);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
