public class Professor extends Person {

    private String employeeID;

    private Department department;

    public Professor(String name, String surname, int age, String employeeID, Department department) {
        super(name, surname, age);
        this.employeeID = employeeID;
        this.department = department;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
