package ocp.exam.ch11;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationExamples {
    public void example1() {
        // sk bundle exists, hierarchy is ocp_sk.properties then ocp.properties
        var locale = new Locale("sk", "SK");
        ResourceBundle bundle = ResourceBundle.getBundle("ocp", locale);
        String message = bundle.getString("message2");
        System.out.println(message);
    }

    public void example2() {
        var locale = new Locale("cs");
        ResourceBundle bundle = ResourceBundle.getBundle("ocp", locale);
        String message1 = bundle.getString("message1");
        System.out.println(message1);
    }

    public static void main(String[] args) {
        LocalizationExamples localizationExamples = new LocalizationExamples();
        localizationExamples.example2();
    }
}
