package dz2;

public class WordAnalizer {
    public static void main(String[] args) {
        String inputString = "Это - место не в Беларуси. Тестовая строка содержит слово короткое и несколько длинных слов.";

        String[] words = inputString.split("\\s+");
        // Разбить строку на слова по пробелам и другим разделителям

        String shortestWord = "";
        String longestWord = "";

        for (String word : words) {
            // Удалить знаки препинания и пробелы вокруг слова
            word = word.replaceAll("[^а-яА-Яa-zA-Z]", "");

            if (word.length() > 0) {

                // Игнорировать пустые слова (после удаления знаков препинания)

                if (shortestWord.isEmpty() || word.length() < shortestWord.length()) {
                    shortestWord = word;
                }
                if (longestWord.isEmpty() || word.length() >= longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        System.out.println("Самое короткое слово: " + shortestWord);
        System.out.println("Самое длинное слово: " + longestWord);
    }
}
