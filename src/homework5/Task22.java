package homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    /*
    Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
    записаных по правилам Java, с помощью регулярных выражений и вывести их на
    страницу.
     */
    public static void main(String[] args) {
        printHexadecimalNumbers("0x00000000   121  0xFFFFFFFF   1x00000000 wrq  0x1234567");
    }

    private static void printHexadecimalNumbers(String text) {
        String stringPattern = "0x([0-9]|[A-F]|[a-f]){8}";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Шестнадцатиричное число: " + matcher.group());
        }
    }
}
