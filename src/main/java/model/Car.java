package model;

public class Car {

    private Location location;
    private Name name;

    public Car(Name name) {
        this(name, new Location(0));
    }

    public Car(Name name, Location location) {
        this.name = name;
        this.location = location;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.toString()).append(" : ").append(location.toString());
        return sb.toString();
    }

    public Location getBiggerLocation(Location maxLocation) {
        if(this.location.isGreaterThan(maxLocation)){
            return this.location;
        }
        return maxLocation;
    }

    public boolean isWinner(Location max) {
        return this.location.equals(max);
    }


    public String nameToStrings() {
        return name.toString();
    }
}
