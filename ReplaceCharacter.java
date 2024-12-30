package Day16_HW;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        char oldChar = 'l';
        char newChar = 'x';

        String newString = originalString.replace(oldChar, newChar);

        System.out.println("Original String: " + originalString);
        System.out.println("New String: " + newString);
    }
}
