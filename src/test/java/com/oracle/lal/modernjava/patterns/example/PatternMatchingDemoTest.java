package com.oracle.lal.modernjava.patterns.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PatternMatchingDemoTest {
    private final PatternMatchingDemo demo = new PatternMatchingDemo();
    @Test
    public void simpleDemo() {
        String actual = demo.demo1(new Object());
        Assertions.assertEquals("Other type: Object", actual);
        actual = demo.demo1(1);
        Assertions.assertEquals("Integer: 1", actual);
        actual = demo.demo1(null);
        Assertions.assertEquals("NULL", actual);
    }

    @Test
    public void anotherDemo() {
        String actual = demo.demo3(-10);
        Assertions.assertEquals("Negative number", actual);

    }

}