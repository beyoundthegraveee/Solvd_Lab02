public class Practice {

    private int amountOfHours;

    private Student student;

    private Company company;

    private int salary;

    public Practice(int amountOfHours, Student student, Company company, int salary) {
        this.amountOfHours = amountOfHours;
        this.student = student;
        this.company = company;
        this.salary = salary;
    }

    public int getAmountOfHours() {
        return amountOfHours;
    }

    public void setAmountOfHours(int amountOfHours) {
        this.amountOfHours = amountOfHours;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
