public class Diploma {

    private String diplomaName;

    private String description;

    private Professor professor;

    private Student student;

    public Diploma(String diplomaName, String description, Professor professor, Student student) {
        this.diplomaName = diplomaName;
        this.description = description;
        this.professor = professor;
        this.student = student;
    }

    public String getDiplomaName() {
        return diplomaName;
    }

    public void setDiplomaName(String diplomaName) {
        this.diplomaName = diplomaName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
