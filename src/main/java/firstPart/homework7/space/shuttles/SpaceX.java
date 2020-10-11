package firstPart.homework7.space.shuttles;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean checkSystemBeforeStarting() {
        return new Random().nextBoolean();
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели шаттла SpaceX запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт шаттла SpaceX");
    }
}
