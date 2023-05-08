package com.oracle.lal.modernjava.textblocks;

public class OCPExamTextBlocks {
    public String example1() {
        return """
                " some text " + x
                blabol \
                blobol 2
                """;
    }

    private static final String CONCAT = " a\n"
            + "  b\n"
            + " c";

    public String exampleIndentConcat(int i) {
        return CONCAT.indent(i);
    }

    public String exampleStripIndent() {
        return CONCAT.stripIndent();
    }

    public String exampleIndentBlock(int i) {
        return """
                a
                 b
                c""".indent(i);
    }

}
