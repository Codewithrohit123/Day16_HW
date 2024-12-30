package Day16_HW;
public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, world!";

        StringBuilder sb = new StringBuilder(originalString);
        String reversedString1 = sb.reverse().toString();

        String reversedString2 = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString2 += originalString.charAt(i);
        }

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String (StringBuilder): " + reversedString1);
        System.out.println("Reversed String (charAt() loop): " + reversedString2);
    }
}
