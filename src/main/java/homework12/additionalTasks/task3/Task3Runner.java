package homework12.additionalTasks.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
3) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.
 */

public class Task3Runner {
    public static void main(String[] args) {
        checkForCensorship(getText(new File("src/main/java/homework12/additionalTasks/task3", "file.txt")));
    }

    private static void checkForCensorship(String text) {
        boolean hasTextBadWords = false;
        List<String> sentencesWithBadWords = new ArrayList<>();

        for (String sentence : text.trim().split("(\\!+)|(\\?+)|(\\.+)")) {
            for (String word : sentence.trim().split("(\\s+)|(\\p{Punct})")) {
                if (isBadWord(word)) {
                    if (hasTextBadWords == false) {
                        hasTextBadWords = true;
                        System.err.println("Проверка на цензуру не пройдена!");
                    }
                    sentencesWithBadWords.add(sentence);
                    break;
                }
            }
        }

        if (hasTextBadWords == true) {
            System.out.println("Подлежащие исправлению предложения:");
            for (int i = 0; i < sentencesWithBadWords.size(); i++) {
                System.out.println("#" + (i + 1) + " " + sentencesWithBadWords.get(i));
            }
        } else {
            System.out.println("Проверка на цензуру успешно пройдена!");
        }
    }

    private static boolean isBadWord(String word) {
        word = word.toLowerCase().replaceAll("\\p{Punct}", "").trim();
        File file = new File("src/homework12/additionalTasks/task3", "blacklist.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                if (word.equals(scanner.next())) {
                    return true;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private static String getText(File file) {
        String text = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                text += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
}