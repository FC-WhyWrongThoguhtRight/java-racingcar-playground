package controller;

import model.Cars;
import model.Circuit;
import view.GameView;

import java.util.Scanner;

public class RacingGame {

    Scanner sc;
    Cars cars;

    public RacingGame(Scanner sc) {
        this.sc = sc;
    }

    public void play() {

        GameView gv = new GameView();
        String names = gv.printNameInput(sc);
        cars = new Cars(names);
        int lap = gv.printAskLapCount(sc);
        Circuit circuit = new Circuit(cars, lap);

        circuit.start();

    }
}
