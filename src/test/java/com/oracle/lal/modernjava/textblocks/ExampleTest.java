package com.oracle.lal.modernjava.textblocks;

import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void indentation() {
        var html = """
                <html>
                    <head>
                        <title>TITLE</title>
                    </head>
                </html>""";
        var html2 = """
                <html>
                    <head>
                        <title>TITLE</title>
                    </head>
                </html>
              """;
        System.out.println(html);
        System.out.println("========");
        System.out.println(html2.stripIndent());
    }
}
