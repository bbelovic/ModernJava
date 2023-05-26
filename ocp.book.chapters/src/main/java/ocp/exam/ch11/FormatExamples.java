package ocp.exam.ch11;

import java.text.DecimalFormat;

public class FormatExamples {
    public String format(String pattern, double value) {
        return new DecimalFormat(pattern).format(value);
    }
}
