package com.oracle.lal.modernjava.textblocks;

import org.junit.jupiter.api.Test;

/**
 * Transition between plain old string nad text block
 * Formatting
 * Escaping
 */
public class ExampleTest {

    @Test
    public void textBlockExample() {
        String sqlCase = """
                SELECT "CustomerName", `City`, 'Country'
                  FROM      Customers
                  ORDER BY
                  
                         (CASE
                            WHEN City IS NULL THEN Country
                            ELSE City
                         END);
                """;
        System.out.println(sqlCase);
        System.out.println("------");

        var html = "<html>\n" +
                "<head>\n" +
                "<title>\"Some title\"</title>\n" +
                "</head>\n" +
                "</html>";
        /*
            <html>\n
            <head>\n
            <title>Some title</title>\n
            </head>\n
            </html>
        */


        var jsonTextBlock = """
                   {
                        window": {
                            "title": "Main 'app' Window",
                            "name": "main_window",
                            "width": 500,
                            "height": 500
                        }
                   }
                   """;

        System.out.println(html);
        System.out.println(jsonTextBlock);

    }
}
