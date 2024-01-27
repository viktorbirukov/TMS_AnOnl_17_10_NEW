package dz1;

public class DocumentProcessor {
    public static void main(String[] args) {
        String docNumber = "1234-abc-5678-xyz-1a2b";

        // Вывести два первых блока по 4 цифры
        printFirstTwoBlocks(docNumber);

        // Вывести номер документа с блоками из трех букв, замененными на ***
        printDocumentWithMaskedLetters(docNumber);

        // Вывести только одни буквы в формате yyy/yyy/y/y в нижнем регистре
        printLowercaseLetters(docNumber);

        // Вывести буквы в формате "Letters:yyy/yyy/y/y" в верхнем регистре
        printUppercaseLetters(docNumber);
    }

    public static void printFirstTwoBlocks(String docNumber) {
        String[] blocks = docNumber.split("-");
        if (blocks.length >= 4) {
            System.out.print(blocks[0] + blocks[1] + "-");
            System.out.println(blocks[2] + blocks[3]);
        }
    }

    public static void printDocumentWithMaskedLetters(String docNumber) {
        String[] blocks = docNumber.split("-");
        StringBuilder maskedNumber = new StringBuilder();
        for (String block : blocks) {
            if (block.matches("[a-zA-Z]{3}")) {
                maskedNumber.append("***");
            } else {
                maskedNumber.append(block);
            }
            maskedNumber.append("-");
        }
        maskedNumber.deleteCharAt(maskedNumber.length() - 1); // Удалить последний "-"
        System.out.println(maskedNumber.toString());
    }

    public static void printLowercaseLetters(String docNumber) {
        StringBuilder lowercaseLetters = new StringBuilder();
        for (char c : docNumber.toCharArray()) {
            if (Character.isLetter(c)) {
                lowercaseLetters.append(Character.toLowerCase(c));
            }
        }
        System.out.println(lowercaseLetters.toString());
    }

    public static void printUppercaseLetters(String docNumber) {
        StringBuilder uppercaseLetters = new StringBuilder("Letters:");
        for (char c : docNumber.toCharArray()) {
            if (Character.isLetter(c)) {
                uppercaseLetters.append(Character.toUpperCase(c));
            }
        }
        System.out.println(uppercaseLetters.toString());
    }
}
