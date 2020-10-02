package homework7.space;

import homework7.space.shuttles.IStart;

public class Spaceport {
    public void launchShuttle(IStart iStart) {
        if (iStart.checkSystemBeforeStarting()) {
            System.out.println("Проверка прошла успешно");
            iStart.startEngines();
            startCountdown();
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }

    }

    private void startCountdown(){
        System.out.println("Обратный отсчет: ");
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
