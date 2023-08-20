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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location1 = (Location) o;

        return location == location1.location;
    }

    @Override
    public int hashCode() {
        return location;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < location ; i++){
            sb.append("-");
        }
        return sb.toString();
    }
}
