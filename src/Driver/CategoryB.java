package Driver;

import Transport.Car;
import Transport.Competing;

public class CategoryB <T extends Car & Competing> extends Driver {

    public CategoryB(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }
    public void race(T car) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем: " + car + " и будет участвовать в заезде.");
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
