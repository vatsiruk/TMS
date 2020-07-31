package homework7.space.shuttles;

public class MyShuttle implements IStart {
    @Override
    public boolean checkSystemBeforeStarting() {
        if (Math.random() * 10 == 5) {
            return true;
        } else {
            return false;
        }
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
