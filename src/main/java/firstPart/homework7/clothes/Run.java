package firstPart.homework7.clothes;

import firstPart.homework7.clothes.boots.RubberBoots;
import firstPart.homework7.clothes.boots.Shoes;
import firstPart.homework7.clothes.boots.Slippers;
import firstPart.homework7.clothes.jackets.Coat;
import firstPart.homework7.clothes.jackets.Windbreaker;
import firstPart.homework7.clothes.jackets.WinterJacket;
import firstPart.homework7.clothes.trousers.Jeans;
import firstPart.homework7.clothes.trousers.SchoolPants;
import firstPart.homework7.clothes.trousers.Shorts;

public class Run {
    /*
     По аналогии с первым задание делаем след. задание.
    Интерфейсы:
    - Куртка
    - Штаны
    - Обувь
    в каждом интерфейсе есть 2 метода (надеть и снять)
    Делаем несколько реализации каждого интерфейса.
    Создаём класс человек:
    У человека поля:
    -имя
    -куртка
    -штаны
    -обувь
    У человека есть 2 метода:
    - одеться(вызываются методы надеть у всех вещей)
    - раздеться (вызываются методы снять у всех вещей)
     */
    public static void main(String[] args) {
        IPerson person1 = new Person("Vasya", new Coat(), new Shorts(), new RubberBoots());
        IPerson person2 = new Person("Masha", new Windbreaker(), new Jeans(), new Shoes());
        IPerson person3 = new Person("Afanasiy", new WinterJacket(), new SchoolPants(), new Slippers());

        person1.putOnEverything();
        System.out.println();
        person2.putOnEverything();
        System.out.println();
        person3.putOnEverything();
        System.out.println("\n");

        person1.takeOffEverything();
        System.out.println();
        person2.takeOffEverything();
        System.out.println();
        person3.takeOffEverything();
    }
}
