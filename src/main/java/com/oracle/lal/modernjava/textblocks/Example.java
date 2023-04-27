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
    static String PYRAMID = """
              *
             * *\"""
            * * *
            """;

    static String DOE_DEER = """
            "doe\"\"\"
            "deer\"""
           xx
           """;

    public static void main(String[] args) {
        System.out.println(PYRAMID);
        System.out.println("   \sX\sX");

        System.out.println("*" + DOE_DEER);
//        System.out.println(HTML.stripIndent());
//        System.out.println(DELIMITER);
//        System.out.println(HTML2);
//        System.out.println(DELIMITER);
    }
}
