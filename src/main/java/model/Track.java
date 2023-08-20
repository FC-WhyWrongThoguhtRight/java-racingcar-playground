package model;

import View.ResultView;

import java.util.List;

public class Track{

    Cars cars;
    Lap laps;
    MovingStrategy ms;
    ResultView rv;

    public Track(Cars cars, Lap laps) {
        this.cars = cars;
        this.laps = laps;
        ms = new RandomMovingStragety();
        rv = ResultView.getInstance();

    }

    public boolean hasCars() {
        return cars.hasCar();
    }

    public boolean hasLap() {
        return laps != null;
    }

    public void run() {

        rv.printResult();
        while(!laps.isEmpty()){

            cars.move(ms);
            rv.printCurrentRace(cars);
            laps = laps.reduceLap();
        }
    }
}
