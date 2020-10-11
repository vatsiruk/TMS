package firstPart.homework7.clothes.boots;

public class Slippers implements IBoots {
    public Slippers() {
    }

    @Override
    public void putOn() {
        System.out.println("Тапочки надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Тапочки сняты");
    }
}
