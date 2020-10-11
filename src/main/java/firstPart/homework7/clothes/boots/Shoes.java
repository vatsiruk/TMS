package firstPart.homework7.clothes.boots;

public class Shoes implements IBoots {
    public Shoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Туфли надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Туфли сняты");
    }
}
