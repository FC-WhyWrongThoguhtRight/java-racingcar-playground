package model;

import View.ResultView;

public class Track{

    Cars cars;
    Lap laps;
    MovingStrategy ms;

    public Track(Cars cars, Lap laps) {
        this.cars = cars;
        this.laps = laps;
        ms = new RandomMovingStragety();
    }

    public boolean hasCars() {
        return cars.hasCar();
    }

    public boolean hasLap() {
        return laps != null;
    }

    public void run() {

        while(laps.isEmpty()){

            cars.move(ms);
            ResultView.getInstance().printCurrentRace(cars);

        }

    }
}
