package homework4;

public class Task20 {
    /*
    Имеется строка с текстом. Вывести текст, составленный из последних букв
    всех слов.
     */
    public static void main(String[] args) {
        System.out.println(getLetters("Имеется строка с текстом. " +
                "Вывести текст, составленный из последних букв всех слов"));
    }

    private static String getLetters(String text) {
        String[] words = text.replaceAll("\\p{Punct}", "").split("\\s");
        String letters = "";
        for (int i = 0; i < words.length; i++) {
            letters += words[i].charAt(words[i].length() - 1);
        }
        return letters;
    }
}
