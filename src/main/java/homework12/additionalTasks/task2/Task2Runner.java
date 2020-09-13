package homework12.additionalTasks.task2;

import java.io.*;

/*
2) Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.

Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false

В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл.

 */
public class Task2Runner {
    public static void main(String[] args) {
        File file = new File("src/main/java/homework12/additionalTasks/task2", "file.txt");
        String text = getTextFromFile(file);
        writeNewFile(text);
    }

    private static void writeNewFile(String text) {
        File newFile = new File("src/main/java/homework12/additionalTasks/task2", "newFile.txt");

        try (FileWriter fw = new FileWriter(newFile)) {
            for (String sentence : text.split("(\\.+)|(\\!+)|(\\?+)")) {
                if (isSuitable(sentence)) {
                    fw.write(sentence.trim() + "\n");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static boolean isSuitable(String sentence) {
        TextFormatter formatter = new TextFormatter();

        if (formatter.isPalindromePresent(sentence)) {
            return true;
        }

        int numberOfWords = formatter.getNumberOfWords(sentence);

        if (numberOfWords >= 3 && numberOfWords <= 5) {
            return true;
        }

        return false;
    }

    private static String getTextFromFile(File file) {
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
