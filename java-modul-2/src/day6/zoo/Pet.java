package day6.zoo;

abstract class Pet {
    String name;
    String color;
    int weight;

    public Pet() {
    }

    public Pet(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Pet(String name) {
        this.name = name;
    }

    abstract void move();

    abstract void sleep();

    protected void eats() {
        System.out.println("3-times food");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString() + "name" + this.name;
    }
}

class Duck extends Pet {
    //String name;


    public Duck(String name, String color, int weight) {
        super(name, color, weight);
        this.flies();
    }

    public Duck(String name) {
        super(name);
    }

    void move() {
        this.flies();
    }

    void sleep() {

    }

    void flies() {
        System.out.println("Fly, bird " + super.name);

    }

    @Override
    protected void eats() {
        super.eats();
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Zmej extends Pet {

    public Zmej(String name, String color, int weight) {
        super(name, color, weight);
        this.move();
    }

    void move() {
        this.fire();

    }

    void sleep() {

    }

    void fire() {
        System.out.println("I breath with fire");
    }

    @Override
    public String toString() {
        return "Zmej{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        /*Pet pet = new Duck("Doland");
        Duck duck = new Duck("Daisy");
        pet.move();
        duck.flies();
        System.out.println(duck);*/
        Pet mypet = new Duck("Donald", "white", 12);
        System.out.println(mypet);
        mypet.move();
        Zmej gorynych = new Zmej("Gorynych", "black", 200);
        System.out.println(gorynych);
        gorynych.move();

    }
}
