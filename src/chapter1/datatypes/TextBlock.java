package chapter1.datatypes;

public class TextBlock {
    public static void main(String[] args) {
        String escaped = "\"Java study guide.\"\n   by Tom and Jerry"; // use escaped characters; but harder to read
        System.out.println(escaped);

        String block = """
                "Java study guide."
                   by Tom and Jerry""";
        // incidental whitespace: anything to the left of the vertical line (on the leftmost non-whitespace char)
        // essential whitespace: anything to the right of the vertical line
        System.out.println(block);
        String blockEndingWithWhiteSpace = """
                    This block has a new line at the end of this text.             
                """; // ending """ should be on the same line as text otherwise a new line is added
        System.out.println(blockEndingWithWhiteSpace);
//        String invalidBlock = """ I'm not a block """; // does not compile: there must be a line break after the opening """
        String blockOneLiner = """
                { \
                 "a": 12 \
                 }"""; // \ at the end of the line omits the new line on that line
        System.out.println(blockOneLiner);
        String blockWithMultipleEscaping = """
                 "doe\"\"\"
                 \"deer\"""
                """;
        System.out.println("*" + blockWithMultipleEscaping + "*");
    }
}
