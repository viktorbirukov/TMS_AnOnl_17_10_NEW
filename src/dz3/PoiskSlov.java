package dz3;

public class PoiskSlov {
    public static void main(String[] args) {
        String inputString = "fffff ab f 1234 jkjk";
        String[] words = inputString.split("\\s+"); // Разбить строку на слова

        String minDistinctCharsWord = null;
        int minDistinctCharsCount = Integer.MAX_VALUE;

        for (String word : words) {
            int distinctCharsCount = countDistinctChars(word);
            if (distinctCharsCount < minDistinctCharsCount) {
                minDistinctCharsCount = distinctCharsCount;
                minDistinctCharsWord = word;
            }
        }

        System.out.println("Слово с минимальным числом различных символов: " + minDistinctCharsWord);
    }

    public static int countDistinctChars(String word) {
        char[] chars = word.toCharArray();
        int distinctCharsCount = 0;
        boolean[] visited = new boolean[128]; // Допустим, что символы в слове ASCII

        for (char c : chars) {
            if (!visited[c]) {
                visited[c] = true;
                distinctCharsCount++;
            }
        }

        return distinctCharsCount;
    }
}
