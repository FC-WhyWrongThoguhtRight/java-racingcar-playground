package model;

import view.RacingView;

import java.util.ArrayList;
import java.util.List;

public class Circuit {

    RacingView rv;
    Cars cars;
    int lap;

    public Circuit(Cars cars, int lap) {
        rv = RacingView.getInstance();
        this.cars = cars;
        this.lap = lap;
    }

    public void start() {

        rv.printRunResultText();
        for(int i = 0 ; i < lap ; i++){
            drive();
            rv.printRacingStatus(cars);
        }
        judgeWinner();

    }

    private void judgeWinner() {
        int max = cars.getMaxLocation();
        List<String> winners = new ArrayList<>();
        for(Car car : cars.getCars()){
            if(max == car.getLocation()){
                winners.add(car.getName());
            }
        }
        rv.printWinner(winners);
    }

    public Cars getCars() {
        return cars;
    }

    public void drive() {
        cars.run();
    }

    public int getLap() {
        return lap;
    }
}
