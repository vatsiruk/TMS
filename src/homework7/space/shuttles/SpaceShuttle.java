package homework7.space.shuttles;

public class SpaceShuttle implements IStart {
    @Override
    public boolean checkSystemBeforeStarting() {
        if ((Math.random() * 10) > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");
    }
}
