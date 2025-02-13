
public class Main {
    public static void main(String[] args) {
    }

    public static String fakeBinImp(String numberString) {
       return numberString.replaceAll("[1-4]","0").replaceAll("[5-9]","1");
    }

    public static String fakeBinDecl(String numberString) {
        return numberString.chars().
                mapToObj(c -> (char) c).
                map(c -> (c >= '5') ? '1' : '0').
                collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
}