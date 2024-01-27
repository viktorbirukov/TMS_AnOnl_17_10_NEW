package dz1;

public class DocumentValidator {
    public static boolean containsSequenceIgnoreCase(String input, String sequence) {
        return input.toLowerCase().contains(sequence.toLowerCase());
    }

    public static boolean startsWith(String input, String prefix) {
        return input.startsWith(prefix);
    }

    public static boolean endsWith(String input, String suffix) {
        return input.endsWith(suffix);
    }

    public static void main(String[] args) {
        String docNumber = "1234-abc-5678-xyz-1a2b";

        // Проверить, содержит ли номер документа "abc" (без учета регистра)
        boolean containsAbc = containsSequenceIgnoreCase(docNumber, "abc");
        System.out.println("Номер документа " + (containsAbc ? "содержит" : "не содержит") + " последовательность 'abc'");

        // Проверить, начинается ли номер документа с "555"
        boolean startsWith555 = startsWith(docNumber, "555");
        System.out.println("Номер документа " + (startsWith555 ? "начинается" : "не начинается") + " с '555'");

        // Проверить, заканчивается ли номер документа на "1a2b"
        boolean endsWith1a2b = endsWith(docNumber, "1a2b");
        System.out.println("Номер документа " + (endsWith1a2b ? "заканчивается" : "не заканчивается") + " на '1a2b'");
    }
}
