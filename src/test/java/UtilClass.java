import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class UtilClass {

    public static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(true,  "true,  ooxx"),
                Arguments.of(false, "xooxx"),
                Arguments.of(true,  "ooxXm"),
                Arguments.of(true,  "zpzpzpp"),
                Arguments.of(false, "zzoo"),
                Arguments.of(true,  "xxxooo"),
                Arguments.of(true,"xxxXooOo"),
                Arguments.of(false,"xxx23424esdsfvxXXOOooo")
        );
    }
}
