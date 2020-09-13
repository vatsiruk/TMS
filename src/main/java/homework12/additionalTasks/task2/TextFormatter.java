package homework12.additionalTasks.task2;

public class TextFormatter {
    public static int getNumberOfWords(String sentence) {
        return sentence.trim().split("(\\s+)|(\\p{Punct})").length;
    }

    public static boolean isPalindromePresent(String sentence) {
        for (String word : sentence.trim().split("(\\s+)|(\\p{Punct}+)")) {
            if (isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String word) {
        if (word.length() == 1) {
            return false;
        }

        word = word.toLowerCase();

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


}
