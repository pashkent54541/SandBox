import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CodeWars {
    /*
Check to see if a string has the same amount of 'x's and 'o's.
The method must return a boolean and be case insensitive. The string can contain any char.
Examples input/output:
XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
    */
    public static void main(String[] args) {

    }

    public static boolean imperativeSolution(String str) {
        int xCounter = 0;
        int oCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') {
                xCounter++;
            }
            if (str.toLowerCase().charAt(i) == 'o') {
                oCounter++;
            }
        }
        return xCounter == oCounter;
    }

    public static boolean declarativeSolution(String str) {
        long xCount = str.toLowerCase().chars().filter(c -> c == 'o').count();
        long oCount = str.toLowerCase().chars().filter(c -> c == 'x').count();

        return xCount == oCount;
    }
}
