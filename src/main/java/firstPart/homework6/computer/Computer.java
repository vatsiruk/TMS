package firstPart.homework6.computer;

import java.util.Random;

public class Computer {
    private String processor;
    private int ram;
    private int hdd;
    private int workLifeCycles;
    private boolean isComputerAlive;
    private boolean isPowerOn;

    public Computer(String processor, int ram, int hdd) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        workLifeCycles = 4;
        isComputerAlive = true;
    }

    public void turnComputerOnOrOff(int number) {
        if (isComputerAlive == false) {
            printBrokenComputerStatus();
            return;
        }

        boolean bool;

        if (number == 1) {
            bool = true;
        } else if (number == 0) {
            bool = false;
        } else {
            System.out.print("Надо было вводить то, что просят. ");
            breakComputer();
            return;
        }

        if (new Random().nextBoolean() == bool) {
            workLifeCycles--;
            if (isPowerOn) {
                System.out.println("Компьютер выключен");
                isPowerOn = false;
            } else {
                isPowerOn = true;
                System.out.println("Компьютер включен");
            }
        } else {
            breakComputer();
        }

        if(workLifeCycles == 0) {
            breakComputer();
            return;
        }
    }

    public boolean isComputerAlive() {
        return isComputerAlive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", workLifeCycles=" + workLifeCycles +
                ", isComputerAlive=" + isComputerAlive +
                ", isPowerOn=" + isPowerOn +
                '}';
    }

    private void breakComputer() {
        isPowerOn = false;
        workLifeCycles = 0;
        isComputerAlive = false;
        printBrokenComputerStatus();
    }

    private void printBrokenComputerStatus() {
        System.out.println("Комп сдох");
    }
}
