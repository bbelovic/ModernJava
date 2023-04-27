package com.oracle.lal.modernjava.textblocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OCPExamTextBlocksTest {

    @Test
    public void testExample1() {
        assertEquals("""
                " some text " + x
                blabol blobol 2
                """, new OCPExamTextBlocks().example1());
    }
}