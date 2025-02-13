import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTests extends UtilClass {

    @Test
    void imperativeSolutionTest() {
        assertEquals("01011110001100111", Main.fakeBinImp("45385593107843568"));
        assertEquals("101000111101101", Main.fakeBinImp("509321967506747"));
        assertEquals("011011110000101010000011011", Main.fakeBinImp("366058562030849490134388085"));
    }

    @Test
    void declarativeSolutionTest() {
        assertEquals("01011110001100111", Main.fakeBinDecl("45385593107843568"));
        assertEquals("101000111101101", Main.fakeBinDecl("509321967506747"));
        assertEquals("011011110000101010000011011", Main.fakeBinDecl("366058562030849490134388085"));
    }
}
