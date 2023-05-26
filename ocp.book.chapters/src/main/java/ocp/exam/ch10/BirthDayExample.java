package ocp.exam.ch10;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthDayExample {
    public void birthDaySummary() {
        var result = Stream.iterate(LocalDate.of(1985, 4, 17), (date) -> date.plusYears(1L))
                .limit(38)
                .filter(date -> date.getDayOfMonth() == 17 && date.getMonth() == Month.APRIL)
                .collect(Collectors.groupingBy(date -> date.getDayOfWeek(), Collectors.counting()));
        System.out.println(result);
    }

    public static void main(String[] args) {
        new BirthDayExample().birthDaySummary();
    }
}
