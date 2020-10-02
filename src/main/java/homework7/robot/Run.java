package homework7.robot;

import homework7.robot.hands.*;
import homework7.robot.heads.*;
import homework7.robot.legs.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IRobot robot1 = new Robot(new SonyHead(17), new SamsungHand(10), new ToshibaLeg(7));
        robot1.action();
        System.out.println(robot1.getPrice() + " долларов стоит робот\n");

        IRobot robot2 = new Robot(new ToshibaHead(2000), new SonyHand(100), new SamsungLeg(700));
        robot2.action();
        System.out.println(robot2.getPrice() + " долларов стоит робот\n");

        IRobot robot3 = new Robot(new SamsungHead(1700), new ToshibaHand(300), new SonyLeg(200));
        robot3.action();
        System.out.println(robot3.getPrice() + " долларов стоит робот\n");

        System.out.println("Самый дорогой робот стоит: " + getMostExpensiveRobot(robot1, robot2, robot3));;
    }

    private static Integer getMostExpensiveRobot(IRobot... robots) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < robots.length; i++) {
            list.add(robots[i].getPrice());
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}
