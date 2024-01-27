package dz5;
public class DuplicateLetters {
    public static void main(String[] args) {
        String inputString = "Hello";
        String duplicatedString = duplicateLetters(inputString);
        System.out.println(duplicatedString);
    }

    public static String duplicateLetters(String input) {
        StringBuilder duplicated = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            duplicated.append(currentChar);
            duplicated.append(currentChar);
        }

        return duplicated.toString();
    }
}
