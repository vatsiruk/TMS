package homework12.additionalTasks.task4;

import java.io.*;

/*
4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс
 */
public class Task4Runner {
    public static void main(String[] args) {
        Car car = new Car("mazda", 190, 90000);
        File file = new File("src/main/java/homework12/additionalTasks/task4", "car.txt");

        serializeObject(car, file);

        System.out.println(readObjectFromFile(file));
    }

    private static void serializeObject(Car car, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Car readObjectFromFile(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
