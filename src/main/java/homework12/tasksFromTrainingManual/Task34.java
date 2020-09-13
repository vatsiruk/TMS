package homework12.tasksFromTrainingManual;

import java.io.*;
import java.util.*;

/*
Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.
 */
public class Task34 {
    public static void main(String[] args) {
        String text = "Имеется1 файл2 с3 текстом4, в5 котором6 присутствуют7 числа8. Найти9 все10 числа1,\n" +
                "распечатать2, посчитать3 сумму4, убрать5 все6 повторяющиеся7 числа8 и9 снова10\n" +
                "распечатать1.";
        File file = new File("src/main/java/homework12/tasksFromTrainingManual", "fileForTask34.txt");

        List<Integer> numbersFromFile = getNumbersFromFile(file);

        System.out.println("Числа из файла " + numbersFromFile +
                "\nСумма этих чисел: " + getSumOfNumbers(numbersFromFile) +
                "\nЧисла из файла без повторений " + getUniqueNumbers(numbersFromFile)
                );
    }

    private static List<Integer> getNumbersFromFile(File file) {
        ArrayList<Integer> numbersFromFile = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)){
            scanner.useDelimiter("\\D+");
            while (scanner.hasNextInt()) {
                numbersFromFile.add(scanner.nextInt());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        return numbersFromFile;
    }

    private static int getSumOfNumbers(List<Integer> numbersFromFile) {
        int result = 0;
        for (int currentNumber : numbersFromFile) {
            result += currentNumber;
        }
        return result;
    }

    private static Set getUniqueNumbers(List<Integer> numbersFromFile) {
        Set<Integer> set = new LinkedHashSet<>(numbersFromFile);
        numbersFromFile.clear();
        numbersFromFile.addAll(set);
        return set;
    }
}
