
public class Main {
    public static void main(String[] args) {
    }

    public static String fakeBinImp(String numberString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) >= '5') {
                sb.insert(i, '1');
            } else {
                sb.insert(i, '0');
            }
        }
        return sb.toString();
    }

    public static String fakeBinDecl(String numberString) {
        return numberString.chars().
                mapToObj(c -> (char) c).
                map(c -> (c >= '5') ? '1' : '0').
                collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
}