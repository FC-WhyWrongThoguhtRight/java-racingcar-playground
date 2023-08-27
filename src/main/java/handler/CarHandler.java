package handler;

import domain.Cars;
import domain.MovingStrategy;
import domain.RandomMovingStrategy;
import view.ModelView;
import view.ViewName;

public class CarHandler {
    private static final CarHandler instance = new CarHandler();
    private static final MovingStrategy strategy = new RandomMovingStrategy();

    private CarHandler() {
    }

    public static CarHandler getInstance() {
        return instance;
    }

    public ModelView handle(Cars cars, int n, Integer tryNum) {
        if (n == tryNum) {
            Cars winnerList = cars.findWinners();
            return new ModelView(ViewName.showFinish, winnerList);
        }
        cars.tryMove(strategy);
        return new ModelView(ViewName.showResult, cars);
    }
}
