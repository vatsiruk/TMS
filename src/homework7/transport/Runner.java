package homework7.transport;

import homework7.transport.model.*;

public class Runner {
    public static void main(String[] args) {
        Transport car = new PassengerTransport(
                "mazda",
                150,
                220,
                6.6,
                4,
                8,
                "custom",
                5
        );
        System.out.println(car.description());
        ((PassengerTransport) car).printInformation(4);

        Transport truck = new FreightTransport(
                "KAMAZ",
                700,
                160,
                45,
                12,
                16,
                40
        );
        System.out.println(truck.description());
        ((FreightTransport) truck).printLoadingStatus(70);
        ((FreightTransport) truck).printLoadingStatus(30);

        Transport plane = new CivilPlane(
                "Boeing",
                4000,
                800,
                70,
                100,
                2700,
                100,
                true
        );
        System.out.println(plane.description());
        ((CivilPlane) plane).printPassengerCapacityStatus(110);
        ((CivilPlane) plane).printPassengerCapacityStatus(99);

        Transport warplane = new WarPlane(
                "Boeing war",
                10000,
                1500,
                40,
                100,
                1700,
                3,
                true
        );
        System.out.println(warplane.description());
        ((WarPlane) warplane).eject();
        for (int i = 0; i < 5; i++) {
            ((WarPlane) warplane).launchMissile();
        }
    }
}
