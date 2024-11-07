import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Swarowski", 33);
        Department department = new Department("dp.Computer Science", 15);
        Professor professor = new Professor("Alice", "Johnson", 22, "05", department);
        Subject subject = new Subject("Discrete Mathematics", "MAD");
        Practitioner practitioner = new Practitioner("Daniel", "Smith", 30, 7, subject);
        Student student = new Student("Sophia", "Roberts", 19, "s28333");
        Classroom classroom = new Classroom(32, 251);
        Course course = new Course("Computer Science", "505X3", "Description....",
                "Warsaw", professor,practitioner, new Subject[]{});
        Semestr semestr = new Semestr(new Date(124, 10, 7), new Date(125, 10,7),
                5, course, new Subject[]{});
        Schedule schedule = new Schedule(new String[]{},new int[]{}, new Date(123, 10, 5),
                new Date(123, 04, 15), classroom);
        University university = new University("PJATK", 1903, "Private");
        Library library = new Library(3000, 10);
        Laboratory laboratory = new Laboratory(30, 101, "ASD_LAB", new String[]{});
        Assignment assignment = new Assignment("4", "Description...");
        Grade grade = new Grade(assignment, course, subject, 5);
        Exam exam = new Exam(subject, new Date(123, 11, 23), 2, "Warsaw");
        Event event = new Event("Party", new Date(132, 12, 06), "Kraków",
                new Person("Emma", "Martinez", 25));
        Diploma diploma = new Diploma("Project", "Description", professor, student);
        Company company = new Company("P&G", "ul. ..., d.15", "+123456789");
        Practice practice = new Practice(200, student, company, 6000);
    }
}