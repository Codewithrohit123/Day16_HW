package Day16_HW;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";

        String trimmedStr = str.trim();

        System.out.println("Original string: " + str);
        System.out.println("String without extra spaces: " + trimmedStr);
    }
}