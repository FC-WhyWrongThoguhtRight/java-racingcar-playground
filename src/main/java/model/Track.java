package model;

public class Track {

    Cars cars;
    Lap lap;

    public Track(Cars cars, Lap lap) {
        this.cars = cars;
        this.lap = lap;
    }

    public boolean hasCars() {
        return cars.hasCar();
    }

    public boolean hasLap() {
        return lap != null;
    }
}
