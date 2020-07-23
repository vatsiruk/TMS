package homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    /*
    Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
    общее их количество.
     */
    public static void main(String[] args) {
        String text = "Строковый& литерал - это (последовательность) символов, заключенных; в! двойные? кавычки. ";
        String punctuationalMarks = getPunctuationalMarks(text);
        System.out.println(text + "\nЗнаки препинания: " + punctuationalMarks +
                " в количестве " + getNumberOfPunctuationalMarks(punctuationalMarks));
    }

    private static String getPunctuationalMarks(String text) {
        String punctuationalMarks = "";

        String stringPattern = "\\p{Punct}";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            punctuationalMarks += matcher.group();
        }
        return punctuationalMarks;
    }

    private static int getNumberOfPunctuationalMarks(String punctuationalMarks) {
        return punctuationalMarks.length();
    }
}
