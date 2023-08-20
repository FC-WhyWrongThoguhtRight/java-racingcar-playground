package carsrace.domain;

public class Car {

    private CarName carName;
    private Distance distance;

    public Car(String name) {
        this.carName = new CarName(name);
        this.distance = new Distance();
    }

    public CarName getCarName() {
        return carName;
    }

    public Distance getDistance() {
        return distance;
    }

    public void addDistance() {
         distance.plusDistance();
    }
}
