package day5.uni;

public class Student extends UniUser {
    private String subject;
    private double notes;
    private int course;
    boolean payForStudy;

    public Student(String firstName, String secondName, int uniID, boolean payForStudy) {
        super(firstName, secondName, uniID);
        this.payForStudy = payForStudy;
    }

    public Student(String firstName) {
        super(firstName);
    }

    public Student(int uniID, int age, String subject) {
        super(uniID, age);
        this.subject = subject;
    }

    public Student(String firstName, String secondName, int uniID, int age) {
        super(firstName, secondName, uniID, age);
    }

    @Override
    public void walks() {
        super.walks();
    }

    private void payForStudy() {
        if (payForStudy) {
            System.out.println("Is paid");
        } else {
            System.out.println("Not paid");
        }
    }

    public void study() {
        System.out.println("Learn!");
    }

    @Override
    public void eats() {
        System.out.println("Discount for food is ");
    }


    /*@Override
    public String toString() {
        return super.toString() + "Student{" +
                "subject='" + subject + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "payForStudy=" + payForStudy +
                '}';
    }
}
