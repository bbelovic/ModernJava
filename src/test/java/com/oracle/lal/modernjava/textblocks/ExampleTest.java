package com.oracle.lal.modernjava.textblocks;

import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    public void indentation2() throws Exception {
        var resource = getClass().getClassLoader().getResource("stripIndent.txt");
        if (resource != null) {
            var allLines = Files.readAllLines(Path.of(resource.toURI()));
            var content = String.join("\n", allLines);
            System.out.println(content);
            System.out.println("========");
            System.out.println(content.stripIndent());
        } else {
            System.out.println("Resource not found..");
        }
    }
}
