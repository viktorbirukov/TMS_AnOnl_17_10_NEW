package dz4;

import java.util.Scanner;

class PalindromeCheker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите номер слова для проверки (например, 3): ");
        int wordIndex = scanner.nextInt();

        String[] words = inputString.split("\\s+");
        if (wordIndex >= 1 && wordIndex <= words.length) {
            String selectedWord = words[wordIndex - 1];
            boolean isPalindrome = isPalindrome(selectedWord);
            if (isPalindrome) {
                System.out.println("Слово '" + selectedWord + "' является палиндромом.");
            } else {
                System.out.println("Слово '" + selectedWord + "' не является палиндромом.");
            }
        } else {
            System.out.println("Указанный номер слова вне диапазона.");
        }
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}