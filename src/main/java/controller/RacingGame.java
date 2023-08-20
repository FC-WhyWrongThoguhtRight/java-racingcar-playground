package controller;

import View.InputView;

import java.util.Scanner;

public class RacingGame {

    Scanner sc;
    InputView inputView;

    public RacingGame(Scanner sc) {
        this.sc = sc;
        inputView = InputView.getInstance();
    }

    public void play() {

        String names = inputView.scanCarNames(sc);
        int lap = inputView.scanLap(sc);

    }
}
