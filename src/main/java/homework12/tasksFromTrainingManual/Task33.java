package homework12.tasksFromTrainingManual;

import java.io.*;

/*
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
 */
public class Task33 {

    public static void main(String[] args) {
        File file = new File("src/main/java/homework12/tasksFromTrainingManual", "fileForTask33.txt");

        writeToFile(file);

        String text = getTextFromFile(file);

        System.out.println("Количество слов в файле: " + getNumberOfWordsInFile(text) +
                ".\nКоличество знаков препинания: " + getNumberOfPunctuationMarks(text));

    }

    private static void writeToFile(File file) {
        String text = "Создать файл с текстом, прочитать, " +
                "подсчитать в тексте количество знаков препинания и слов.";

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static String getTextFromFile(File file) {
        String text = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text += line;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return text;
    }

    private static int getNumberOfWordsInFile(String text) {
        return text.trim().replaceAll("\\p{Punct}+", " ").split("\\s+").length;
    }

    private static int getNumberOfPunctuationMarks(String text) {
        return text.length() - text.replaceAll("\\p{Punct}", "").length();
    }
}