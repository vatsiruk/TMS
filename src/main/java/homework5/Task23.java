package homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task23 {
    /*
    Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
    которых есть параметры, например <p id=”p1”>, и замену их на простые теги
    абзацев <p>.
     */
    public static void main(String[] args) {
        String htmlCode = "<p class=\"office\"> Адрес главного офиса <br>\n" +
                "и оффлайн-магазина:\n" +
                "</p>\n" +
                "<p class=\"street\">ул. Большая Конюшенная <br>\n" +
                "19/8, Санкт-Петербург\n" +
                "</p>\n" +
                "<p class=\"office\"> Для заказов по телефону:\n" +
                "</p>\n" +
                "<p class=\"street\"> 8 812 450-25-25\n" +
                "</p>\n" +
                "<p class=\"office\"> (с 10 до 20 ежедневно)\n" +
                "</p>";

        System.out.println("Изначальный текст:\n" + htmlCode +
                "\n\nИзмененный текст:\n" + getModifiedHtmlCode(htmlCode)
        );
    }

    private static String getModifiedHtmlCode(String htmlCode) {
        String stringPattern = "<p (\\S+=\\S+)+>";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(htmlCode);

        while (matcher.find()) {
            htmlCode = htmlCode.replaceFirst(matcher.group(), "<p>");
        }
        return htmlCode;
    }
}
