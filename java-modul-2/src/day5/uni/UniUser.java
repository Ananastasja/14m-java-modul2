package day5.uni;

public class UniUser extends Person {
    public String firstName;
    private String secondName;
    public int uniID;
    private int age;
    private String address;

    public UniUser(String firstName) {
        this.firstName = firstName;
    }

    public UniUser(int uniID, int age) {
        this.uniID = uniID;
        this.age = age;
    }

    public UniUser(String firstName, String secondName, int uniID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
    }

    public UniUser(String firstName, String secondName, int uniID, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.age = age;
    }

    public void eats() {
        System.out.println("Discount for food is ");
    }

    public void walks() {
        System.out.println("Walks in campus");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", uniID='" + uniID + '\'' +
                '}';
    }

    public static void print(UniUser[] arr) {
        for (UniUser element : arr) {
            System.out.println(element + " ");

        }
    }


}
