import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests extends UtilClass {

    @ParameterizedTest
    @MethodSource("data")
    void imperativeSolutionTest(boolean expected, String input) {
        assertEquals(expected,CodeWars.imperativeSolution(input));
    }

    @ParameterizedTest
    @MethodSource("data")
    void declarativeSolutionTest(boolean expected, String input) {
        assertEquals(expected,CodeWars.declarativeSolution(input));
    }
}
