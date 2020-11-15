package day5.uni;

public class UniApplication {
    public static void main(String[] args) {
        int index = 1;
        //inheritanceIntro();
        /*Student sasha = new Student("Sasha");
        Teacher masha = new Teacher("Masha");
        Worker glasha = new Worker("Glasha");
        UniUser pasha = new Student("Pasha");
        UniUser sergej = new UniUser("Sergej");
        UniUser andrej = new Teacher("Andrej");
        Object ob = new Teacher("Zavuch");
        Teacher newteacher = (Teacher) ob;*/
        Student katja = new Student("Katja", "Ivanova", 570095, true);
        Student valera = new Student("Valera", "Smirnov", 465912, true);
        Student dima = new Student("Dima", "Lepuchov", 684596, false);
        Teacher oleg = new Teacher("Oleg", "Smirnov", 568416, false);
        Teacher olga = new Teacher("Olga", "Samarova", 547965, false);
        Teacher natasha = new Teacher("Natasha", "Lerova", 587962, true);
        Worker nastja = new Worker("Nasja", "Lessman", 452668, true);
        Worker kolya = new Worker("Kolya", "Belov", 521964, false);
        Worker ilya = new Worker("Ilya", "Matveev", 532945, true);
        UniUser kostya = new Student("Kostya", "Borisov", 368465, true);
        UniUser lera = new Teacher("Lera", "Vaseva", 269756, false);
        UniUser klara = new Worker("Klara", "Königs", 593107, false);
        UniUser roma = new Student("Roma", "Korolev", 129852, true);
        Student[] allStudents = new Student[]{katja, valera, dima};
        Teacher[] allTeachers = new Teacher[]{oleg, olga, natasha};
        Worker[] allWorkers = new Worker[]{nastja, kolya, ilya};
        UniUser[] allUsers = new UniUser[]{katja, valera, dima, oleg, olga, natasha, nastja, kolya, ilya, kostya, lera, klara, roma};
       /* UniUser.print(allStudents);
        UniUser.print(allWorkers);
        UniUser.print(allTeachers);*/
        //UniUser.print(deleteElement(allStudents, 1));
        //UniUser.print(addElement(allStudents, nastja));
        //UniUser.print(changeElement(allTeachers, 0, lera));
        UniUser.print(sortID(allUsers));
    }

    private static UniUser[] sortID(UniUser[] arr) {
        for (int i = 0; i < arr.length; i++) {
            UniUser temp = arr[i];
            int index = i - 1;
            while (index >= 0 && arr[index].uniID > temp.uniID){
                arr[index + 1] = arr[index];
                index = index - 1;
            }
            arr[index + 1] = temp;

        }
        return arr;
    }

    private static UniUser[] changeElement(UniUser[] arr, int change, UniUser newUser) {
        arr[change] = newUser;
        return arr;
    }

    private static UniUser[] deleteElement(UniUser[] arr, int index) {
        UniUser[] output = new UniUser[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];

        }
        for (int i = index; i < output.length; i++) {
            output[i] = arr[i + 1];

        }
        return output;

    }


    private static UniUser[] addElement(UniUser[] arr, UniUser element) {
        UniUser[] output = new UniUser[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        output[arr.length] = element;
        return output;
    }


    private static void inheritanceIntro() {
        Student pasha = new Student(
                570095,
                25,
                "Java-Programmer");

        System.out.println(pasha);

        Teacher dasha = new Teacher(
                "Dasha",
                "Solovej",
                125478,
                35,
                "Professor");

        System.out.println(dasha);
    }
}
