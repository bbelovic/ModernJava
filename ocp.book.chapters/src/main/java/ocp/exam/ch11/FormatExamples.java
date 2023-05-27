package ocp.exam.ch11;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class FormatExamples {
    public String format(String pattern, double value) {
        return new DecimalFormat(pattern).format(value);
    }

    public String currency(double val, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        return currencyInstance.format(val);
    }

    public void compactFormat(long val, List<Locale> locales) {
        locales.stream()
                .flatMap(locale -> Stream.of(NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT),
                        NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG)))
                .map(nf -> nf.format(val))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        FormatExamples formatExamples = new FormatExamples();
        String currency = formatExamples.currency(111_222.525, Locale.GERMANY);
        System.out.println(currency);

        formatExamples.compactFormat(77_234_009, List.of(Locale.US, Locale.GERMANY, Locale.ITALIAN));
    }
}
