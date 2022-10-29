package Driver;

import Transport.Competing;
import Transport.Trucks;

public class CategoryC <T extends Trucks & Competing> extends Driver  {

    public CategoryC(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }
    public void race(T trucks) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем: " + trucks + " и будет участвовать в заезде.");
    }

    @Override
    public void startMoving() {

    }
    @Override
    public void stop() {

    }
    @Override
    public void refuel() {

    }
}
