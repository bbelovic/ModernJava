package ocp.exam.ch4;

import java.time.*;

public class OCPDateTimePractices {
    public ZonedDateTime summerDaylightSavingTime(Duration duration) {
        var date = LocalDate.of(2023, Month.MARCH, 12);
        var time = LocalTime.of(1, 30);
        var dateTime = ZonedDateTime.of(date, time, ZoneId.of("US/Eastern"));
        System.out.println(dateTime.getOffset());
        return dateTime.plus(duration);
    }
}
