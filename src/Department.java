public class Department {

    private String departmentName;

    private int amountOfEmployees;

    public Department(String departmentName, int amountOfEmployees) {
        this.departmentName = departmentName;
        this.amountOfEmployees = amountOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getAmountOfEmployees() {
        return amountOfEmployees;
    }

    public void setAmountOfEmployees(int amountOfEmployees) {
        this.amountOfEmployees = amountOfEmployees;
    }
}
