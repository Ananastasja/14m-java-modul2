package day5.uni;

public class Worker extends UniUser{
    private String position;
    private String room;
    boolean getSalary;

    public Worker(String firstName, String secondName, int uniID, boolean getSalary) {
        super(firstName, secondName, uniID);
        this.getSalary = getSalary;
    }

    public Worker(String firstName) {
        super(firstName);
    }

    public Worker(int uniID, int age) {
        super(uniID, age);
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

    public void work() {
        System.out.println("Work!");
    }

    public void eats() {
        System.out.println("Discount for food is ");
    }

    @Override
    public String toString() {
        return super.toString() + "Worker{" +
                "getSalary=" + getSalary +
                '}';
    }
}
