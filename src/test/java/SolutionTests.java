import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests extends UtilClass {

    @Test
    void imperativeSolutionTest() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Main.reverseWords("The quick brown fox jumps over the lazy dog."), "Input: \"The quick brown fox jumps over the lazy dog.\"");
        assertEquals("elppa", Main.reverseWords("apple"), "Input: \"apple\"");
        assertEquals("a b c d", Main.reverseWords("a b c d"), "Input: \"a b c d\"");
        assertEquals("  elbuod  decaps  sdrow  ", Main.reverseWords("  double  spaced  words  "), "Input: \"  double  spaced  words  \"");
    }

    @Test
    void declarativeSolutionTest() {

    }
}
