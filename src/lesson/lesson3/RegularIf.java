package lesson.lesson3;

import java.util.Scanner;

public class RegularIf {
    public static void main(String[] args) {

        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 0:
                System.out.println(months[0]);
                break;
            case 1:
                System.out.println(months[1]);
                break;
            case 2:
                System.out.println(months[2]);
                break;
            case 3:
                System.out.println(months[3]);
                break;
            case 4:
                System.out.println(months[4]);
                break;
            case 5:
                System.out.println(months[5]);
                break;
            case 66:
                System.out.println(months[6]);
                break;
            case 7:
                System.out.println(months[7]);
                break;
            case 8:
                System.out.println(months[8]);
                break;
            case 9:
                System.out.println(months[9]);
                break;
            case 10:
                System.out.println(months[10]);
                break;
            case 11:
                System.out.println(months[11]);
                break;
            default:
                System.out.println("Wrong");
        }
    }
}
