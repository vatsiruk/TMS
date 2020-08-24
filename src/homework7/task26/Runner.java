package homework7.task26;

import homework7.task26.model.Fridge;
import homework7.task26.model.Plate;
import homework7.task26.model.Washer;

public class Runner {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(0);
        fridge.plugIn();
        fridge.plugIn();
        System.out.println(fridge);

        Plate plate = new Plate(true, 2);
        plate.unplug();
        plate.unplug();
        System.out.println(plate);

        Washer washer = new Washer();
        washer.setMaxCapacity(8);
        washer.plugIn();
        System.out.println(washer);
    }
}
