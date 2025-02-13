public class Main {
    public static void main(String[] args) {


    }

    public static String reverseWords(final String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                result.append(word.reverse()).append(c);
                word.setLength(0);
            } else {
                word.append(c);
            }
        }
        result.append(word.reverse());

        return result.toString();
    }
}