package com.oracle.lal.modernjava.textblocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OCPExamTextBlocksTest {
    private final OCPExamTextBlocks underTest = new OCPExamTextBlocks();

    @Test
    public void testExample1() {
        assertEquals("""
                " some text " + x
                blabol blobol 2
                """, new OCPExamTextBlocks().example1());
    }

    @Test
    public void testExampleIndent() {
        String actual = underTest.exampleIndentBlock(1);
        String expected = """
                 a
                  b
                 c
                """;
        assertEquals(expected, actual);

        expected = """
                a
                b
                c
                """;

        actual = underTest.exampleIndentBlock(-3);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleIndentConcat() {
        String actual = underTest.exampleIndentConcat(-3);
        String expected = """
                a
                b
                c
                """;
        assertEquals(expected, actual);
    }
}