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

    public String exampleIndentConcat(int i) {
        var concat = " a\n"
                + "  b\n"
                + " c";
                return  concat.indent(i);
    }

    public String exampleIndentBlock(int i) {
        return """
                a
                 b
                c""".indent(i);
    }

}
