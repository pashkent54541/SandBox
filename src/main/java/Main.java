public class Main {
    public static void main(String[] args) {


    }

    public static String reverseWords(final String s) {
        String[] words = s.split(" ");
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            resultString.append(reverseWord(words[i]));
            if (i < words.length - 1) {
                resultString.append(" ");
            }
        }
        return resultString.toString();
    }

    private static String reverseWord(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}