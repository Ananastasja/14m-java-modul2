package day8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HomeWork {
    public static void main(String[] args) {
        findDaysInbetween();
    }

    private static void findDaysInbetween() {
        LocalDate newYear = LocalDate.parse("2021-01-01");
        LocalDate now = LocalDate.now();
        long daysToNY = ChronoUnit.DAYS.between(now, newYear);
        System.out.println(daysToNY + " days till New Year!");
    }
}
