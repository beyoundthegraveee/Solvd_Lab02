public class Practitioner extends Person{

    private int amountOfClasses;

    private Subject subject;

    public Practitioner(String name, String surname, int age, int amountOfClasses, Subject subject) {
        super(name, surname, age);
        this.amountOfClasses = amountOfClasses;
        this.subject = subject;
    }

    public int getAmountOfClasses() {
        return amountOfClasses;
    }

    public void setAmountOfClasses(int amountOfClasses) {
        this.amountOfClasses = amountOfClasses;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
