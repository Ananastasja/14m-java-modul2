package day8;

import java.time.LocalDate;
import java.time.Period;

public class HumanYears {
    String name;
    String birthday;

    public HumanYears(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getYears () {
        LocalDate today = LocalDate.now();
        Period yearsOfHuman = Period.between(LocalDate.parse(birthday), today);
        return yearsOfHuman.getYears();
    }
}

class Years {
    public static void main(String[] args) {
        HumanYears anna = new HumanYears("Anna", "1995-07-11");
        System.out.println(anna.getYears());
        HumanYears nina = new HumanYears("Nina", "1964-05-05");
        System.out.println(nina.getYears());
    }
}
