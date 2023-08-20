package controller;

import View.InputView;
import View.ResultView;
import model.*;

import java.util.List;
import java.util.Scanner;

public class RacingGame {

    Scanner sc;
    InputView inputView;
    ResultView resultView;

    public RacingGame(Scanner sc) {
        this.sc = sc;
        inputView = InputView.getInstance();
        resultView = ResultView.getInstance();
    }

    public void play() {

        List<Name> names = inputView.scanCarNames(sc);
        Cars cars = new Cars(names);
        Lap lap = inputView.scanLap(sc);
        Track track = new Track(cars, lap);

        track.run();

        List<Car> winners = cars.getWinner();
        resultView.printWinners(winners);
    }
}
