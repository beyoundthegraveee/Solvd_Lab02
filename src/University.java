public class University {

    private String universityName;

    private int yearOfConstruction;

    private String status;

    public University(String universityName, int yearOfConstruction, String status) {
        this.universityName = universityName;
        this.yearOfConstruction = yearOfConstruction;
        this.status = status;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
