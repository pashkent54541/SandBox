import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests extends UtilClass {

    @Test
    void imperativeSolutionTest() {
        assertEquals(1, CodeWars.imperativeSolution(new ArrayList<>(Arrays.asList(0,0,0,1))));
        assertEquals(15, CodeWars.imperativeSolution(new ArrayList<>(Arrays.asList(1,1,1,1))));
        assertEquals(6, CodeWars.imperativeSolution(new ArrayList<>(Arrays.asList(0,1,1,0))));
        assertEquals(9, CodeWars.imperativeSolution(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }

    @Test
    void declarativeSolutionTest() {
        assertEquals(1, CodeWars.declarativeSolution(new ArrayList<>(Arrays.asList(0,0,0,1))));
        assertEquals(15, CodeWars.declarativeSolution(new ArrayList<>(Arrays.asList(1,1,1,1))));
        assertEquals(6, CodeWars.declarativeSolution(new ArrayList<>(Arrays.asList(0,1,1,0))));
        assertEquals(9, CodeWars.declarativeSolution(new ArrayList<>(Arrays.asList(1,0,0,1))));
    }
}
