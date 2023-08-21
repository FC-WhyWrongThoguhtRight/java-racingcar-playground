package carsrace;

import carsrace.service.CarRaceService;

public class Application {
    public static void main(String[] args) {
        CarRaceService carRaceService = new CarRaceService();
        carRaceService.startGame();
    }
}
