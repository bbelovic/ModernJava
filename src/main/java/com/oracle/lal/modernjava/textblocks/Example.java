package com.oracle.lal.modernjava.textblocks;

public class Example {
    private static final String HTML = """
              <html>
              <head>
              <title>"$TEST"</title>
              </head>
              </html>                           
          """;

    private static final String DELIMITER = "====================";

    private static final String HTML2 = """
            <html>
            <head>
            <title>"$TEST"</title>
            </head>
            </html>
            """;

    public static void main(String[] args) {
        System.out.println(HTML.stripIndent());
        System.out.println(DELIMITER);
        System.out.println(HTML2);
        System.out.println(DELIMITER);
    }
}
