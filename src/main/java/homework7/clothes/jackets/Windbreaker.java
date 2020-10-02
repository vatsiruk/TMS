package homework7.clothes.jackets;

public class Windbreaker implements IJacket{
    public Windbreaker() {
    }

    @Override
    public void putOn() {
        System.out.println("Ветровка надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Ветровка снята");
    }
}
