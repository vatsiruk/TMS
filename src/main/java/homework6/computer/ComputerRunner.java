package homework6.computer;

import java.util.Scanner;

public class ComputerRunner {
    /*
        Создать класс компьютер.
        Поля:
        - процессор
        - оперативка
        - жесткий диск
        - ресурс полных циклов работы (включений/выключений)

        Методы:
        - метод описание(вывод всех полей)
        - метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1),
          вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает
        - выключить (аналогично включению)
        - при превышении лимита ресурса комп сгорает
        - если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
         */
    public static void main(String[] args) {
        Computer computer = new Computer("i5 9400F", 32, 2048);
        while (computer.isComputerAlive()){
            computer.turnComputerOnOrOff(inputNumber());
        }
    }

    private static int inputNumber() {
        System.out.print("Введите 0 или 1: ");
        return new Scanner(System.in).nextInt();
    }
}
