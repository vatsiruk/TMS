package homework12.tasksFromTrainingManual;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
 */
public class Task35 {
    public static void main(String[] args) {
        File file = createFile();

        List<Integer> numbersFromFile = getNumbersFromFile(file);
        System.out.println("Числа из файла " + numbersFromFile +
                "\nИх среднее арифметическое: " + getArithmeticalMean(numbersFromFile));
    }

    private static File createFile() {
        File file = new File("src/main/java/homework12/tasksFromTrainingManual", "fileForTask35.bin");

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 100));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return file;
    }

    private static List<Integer> getNumbersFromFile(File file) {
        ArrayList<Integer> numbersFromFile = new ArrayList<>();

        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while(numbersFromFile.size() != 20) {
                numbersFromFile.add(dis.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbersFromFile;
    }

    private static double getArithmeticalMean(List<Integer> numbersFromFile) {
        int sum = 0;
        for (int currentNumber : numbersFromFile) {
            sum += currentNumber;
        }
        return sum / numbersFromFile.size();
    }
}
