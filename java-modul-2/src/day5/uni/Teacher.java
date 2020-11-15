package day5.uni;

public class Teacher extends UniUser {
    private String subject;
    private String position;
    private String range;
    private String degree;
    private double salary;
    boolean getSalary;

    public Teacher(String firstName, String secondName, int uniID, boolean getSalary) {
        super(firstName, secondName, uniID);
        this.getSalary = getSalary;
    }

    public Teacher(String firstName) {
        super(firstName);
    }

    public Teacher(String firstName, String secondName, int uniID, int age, String range) {
        super(firstName, secondName, uniID, age);
        this.range = range;
    }

    public void getSalary() {
        if (getSalary) {
            System.out.println("I have got my salary");
        }else  {
            System.out.println("I have not got my salary");
        }
    }

    @Override
    public void walks() {
        super.walks();
    }

    @Override
    public void eats() {
        super.eats();
    }

    public void teach() {
        System.out.println("Teach!");
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "getSalary=" + getSalary +
                '}';
    }
}
