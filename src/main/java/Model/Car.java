package Model;

public class Car {

    private Location location;
    private Name name;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int location) {
        this.name = new Name(name);
        this.location = new Location(location);
    }


    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.isMovable()) {
            location = location.move();
        }
    }

    public boolean hasName() {
        return name != null;
    }

    public boolean hasLocation() {
        return location != null;
    }

    public boolean isGreaterThan(Car car) {
        return this.location.isGreaterThan(car.location);
    }
}
