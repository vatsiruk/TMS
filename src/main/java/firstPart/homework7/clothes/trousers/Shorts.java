package firstPart.homework7.clothes.trousers;

public class Shorts implements ITrousers {
    public Shorts() {
    }

    @Override
    public void putOn() {
        System.out.println("Шорты надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Шорты сняты");
    }
}
