package com.oracle.lal.modernjava.textblocks;

public class OCPExamTextBlocks {
    public String example1() {
        int x;
        String block = """
                " some text " + x
                blabol \
                blobol 2
                """;
        return block;
    }

}
