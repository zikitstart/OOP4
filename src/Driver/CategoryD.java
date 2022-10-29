package Driver;

import Transport.Bus;
import Transport.Competing;

public class CategoryD <T extends Bus & Competing> extends Driver  {

    public CategoryD(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }
    public void race(T bus) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем: " + bus + " и будет участвовать в заезде.");
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
