package firstPart.homework10.tasksFromTrainingManual;

import java.util.HashMap;
import java.util.Map;

/*
Имеется текст. Следует составить для него частотный словарь.
 */
public class Task32 {
    public static void main(String[] args) {
        String text = "            ПРивет,         меня зовут Вася."
                + " Привет, меня  зовут Миша."
                + "Привет, меня зовут Саша          .       "
                + "Привет, меня зовут Таня.           ";
        printFrequencyVocabulary(getFrequencyVocabulary(text));
    }

    private static void printFrequencyVocabulary(Map<String, Integer> frequencyVocabulary) {
        for (Map.Entry entry : frequencyVocabulary.entrySet()) {
            System.out.println("Слово \"" + entry.getKey() + "\" встречается в количестве " + entry.getValue());
        }
    }

    private static Map<String, Integer> getFrequencyVocabulary(String text) {
        Map<String, Integer> frequencyVocabulary = new HashMap<>();

        for (String word : text.trim().toLowerCase().replaceAll("\\p{Punct}+", " ").split("\\s+")) {
            if (frequencyVocabulary.keySet().contains(word)) {
                frequencyVocabulary.put(word, frequencyVocabulary.get(word) + 1);
            } else {
                frequencyVocabulary.put(word, 1);
            }
        }

        return frequencyVocabulary;
    }

}
