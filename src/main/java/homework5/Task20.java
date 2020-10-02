package homework5;

public class Task20 {
    /*
    Имеется строка с текстом. Вывести текст, составленный из последних букв
    всех слов.
     */
    public static void main(String[] args) {
        System.out.println(getLetters("Имеется строка с текстом. " +
                "Вывести текст,составленный из последних букв всех слов"));
    }

    private static String getLetters(String text) {
        String[] words = text.replaceAll("\\p{Punct}+", " ").split("\\s+");
        String letters = "";
        for (String word : words) {
            letters += word.charAt(word.length() - 1);
        }
        return letters;
    }
}
