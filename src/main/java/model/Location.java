package model;

public class Location {
    private int location;

    public Location(int location) {
        this.location = location;
    }

    public Location move() {
        return new Location(location + 1);
    }

    public boolean isGreaterThan(Location location) {
        return this.location > location.location;
    }
}
