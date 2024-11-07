public class Assignment {

    private String numberOfAssignments;

    private String description;

    public Assignment(String numberOfAssignments, String description) {
        this.numberOfAssignments = numberOfAssignments;
        this.description = description;
    }

    public String getNumberOfAssignments() {
        return numberOfAssignments;
    }

    public void setNumberOfAssignments(String numberOfAssignments) {
        this.numberOfAssignments = numberOfAssignments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
