package ocp.exam.ch11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingExamples {
    public String incompatibleFormats(LocalDate localDate, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return localDate.format(formatter);
    }
}
