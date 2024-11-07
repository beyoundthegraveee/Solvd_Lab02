public class Laboratory extends Classroom{

    private String labName;

    private String [] equipment;

    public Laboratory(int capacity, int roomNumber, String labName, String[] equipment) {
        super(capacity, roomNumber);
        this.labName = labName;
        this.equipment = equipment;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }
}
