package com.oracle.lal.modernjava.patterns.example;

public class PatternMatchingDemo {
    public String demo1(Object o) {
        return switch (o) {
            case Integer i -> String.format("Integer: %d", i);
            case null -> "NULL";
            case Double d -> String.format("Double: %.2f", d);
            case default -> "Other type: " + o.getClass().getSimpleName();
        };
    }

    public String demo2(String s) {
        return switch (s) {
            case "foo", "bar" -> "Foo or bar";
            case "zoo" -> s.toUpperCase();
            default -> "not recognized";
        };
    }

    public String demo3(Integer i) {
        return switch (i) {
            case 1, -1 -> "One or minus one";
            case 0 -> "zero number";
            default -> "n/a";
        };
    }

//    public String booleanNotSupported(boolean b) {
//        return switch (b) {
//            case false -> "false";
//            default -> "true";
//
//        };
//    }

//    public void doubleNotSupported(double d) {
//        switch (d) {
//            case 1.0 -> System.out.println("1.0");
//        }
//    }
}
