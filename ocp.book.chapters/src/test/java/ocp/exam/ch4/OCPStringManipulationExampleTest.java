package ocp.exam.ch4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OCPStringManipulationExampleTest {

    @Test
    public void indentExamExample1() {
        /*
        var numbers = "012345678".indent(1);
        numbers = numbers.stripLeading();
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.print(numbers.substring(7));
        */


        var s = "012345678".indent(2);
        assertEquals("""
                  012345678
                """, s);
        assertEquals("""
                012345678
                """, s.stripLeading());
        var nums = s.stripLeading();
        assertEquals("", nums.substring(7, 7));
        assertEquals("78\n", nums.substring(7));
    }

    @Test
    public void indentExamExample2() {

        var base = "ewe\nsheep\\t";
        int length = base.length();
        int indent = base.indent(2).length();
        int translate = base.translateEscapes().length();

        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.format(formatted);

        assertEquals(11, base.length());
        assertEquals("""
                ewe
                sheep\\t""", base);

        assertEquals(16, base.indent(2).length());
        assertEquals("""
                    ewe
                    sheep\\t
                  """, base.indent(2));

        assertEquals(10, base.translateEscapes().length());
        assertEquals("""
                ewe
                sheep\t""", base.translateEscapes());

        assertEquals(5, """
                sss\s
                """.length());

    }

    @Test
    public void testStringInternMechanics() {
        var s = "Hello";
        var t = new String(s);
        assertTrue(s.equals(t));
        assertFalse(s == t);
        assertTrue(t.intern() == s);

        assertTrue("Hello" == s);
        assertTrue("Hello".intern() == s);
        assertTrue("Hello".intern() == s);
        assertTrue("Hello".intern() != t);
    }

    @Test
    public void test() {
        int y = 0;
        var x = """
                y = " " ' \"
                x =\s""" + y + """
                esc \"""
                
                a
                
                """;
        System.out.println(x);
        System.out.println("===");
    }
}