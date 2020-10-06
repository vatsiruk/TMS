package firstPart.homework7.clothes.boots;

public class RubberBoots implements IBoots {
    public RubberBoots() {
    }

    @Override
    public void putOn() {
        System.out.println("Резиновые сапоги надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Резиновые сапоги сняты");
    }
}
