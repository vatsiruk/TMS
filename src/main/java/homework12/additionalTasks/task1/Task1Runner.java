package homework12.additionalTasks.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
1) В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы

 */
public class Task1Runner {
    public static void main(String[] args) {
        File file = new File("src/main/java/homework12/additionalTasks/task1", "file.txt");
        createFileWithPalindromes(file);
    }

    private static void createFileWithPalindromes(File file) {
        File fileWithPalindromes =
                new File("src/main/java/homework12/additionalTasks/task1", "fileWithPalindromes.txt");

        try (Scanner scanner = new Scanner(file); FileWriter fw = new FileWriter(fileWithPalindromes)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (isPalindrome(word)) {
                    fw.write(word + " ");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
