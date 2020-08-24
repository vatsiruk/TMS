package homework7.space.shuttles;

public class MyShuttle implements IStart {
    @Override
    public boolean checkSystemBeforeStarting() {
        return Math.random() * 10 == 5;
    }

    @Override
    public void startEngines() {
        System.out.println("Ничего себе! Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт моего шаттла");
    }
}
