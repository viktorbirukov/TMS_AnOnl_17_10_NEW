package dz1;

public class DocProcProverka {
    public static void main(String[] args) {
        String docNumber = "1234-abc-5678-xyz-1a2b";

        // Проверить, содержит ли номер документа "abc" (без учета регистра)
        boolean containsAbc = containsSequenceIgnoreCase(docNumber, "abc");
        System.out.println("Номер документа " + (containsAbc ? "содержит" : "не содержит") + " последовательность 'abc'");

        // Проверить, начинается ли номер документа с "555"
        boolean startsWith555 = docNumber.startsWith("555");
        System.out.println("Номер документа " + (startsWith555 ? "начинается" : "не начинается") + " с '555'");

        // Проверить, заканчивается ли номер документа на "1a2b"
        boolean endsWith1a2b = docNumber.endsWith("1a2b");
        System.out.println("Номер документа " + (endsWith1a2b ? "заканчивается" : "не заканчивается") + " на '1a2b'");
    }

    public static boolean containsSequenceIgnoreCase(String input, String sequence) {
        return input.toLowerCase().contains(sequence.toLowerCase());
    }
}
