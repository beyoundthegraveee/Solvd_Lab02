public class Assignment {

    private String numberOfAssignment;

    private String description;

    public Assignment(String numberOfAssignment, String description) {
        this.numberOfAssignment = numberOfAssignment;
        this.description = description;
    }

    public String getNumberOfAssignments() {
        return numberOfAssignment;
    }

    public void setNumberOfAssignments(String numberOfAssignments) {
        this.numberOfAssignment = numberOfAssignment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
