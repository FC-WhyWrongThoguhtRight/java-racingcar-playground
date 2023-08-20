package controller;

import View.InputView;
import model.Cars;
import model.Lap;
import model.Name;
import model.Track;

import java.util.List;
import java.util.Scanner;

public class RacingGame {

    Scanner sc;
    InputView inputView;

    public RacingGame(Scanner sc) {
        this.sc = sc;
        inputView = InputView.getInstance();
    }

    public void play() {

        List<Name> names = inputView.scanCarNames(sc);
        Cars cars = new Cars(names);
        Lap lap = inputView.scanLap(sc);
        Track track = new Track(cars, lap);

        track.run();
    }
}
