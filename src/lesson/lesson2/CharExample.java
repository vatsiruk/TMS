package lesson.lesson2;

import java.util.Scanner;

public class CharExample {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int character = scanner.nextInt();
        char eq = (char) character;

        System.out.println(eq);
        */

        String str1 = "test";// строка будет создана в heap и перенесена в stack
        String str2 = "test";// сразу сошлется на уже созданное значение в stack
        String str3 = new String("test");// строка будет создана в heap

        System.out.println(str1 == str2); // true
        System.out.println(str2 == str3); // false

        String str4 = new String(new byte[]{65, 66, 67}); // "ABC"
        String str5 = new String("ABC");
        System.out.println(str4 == str5);
    }
}