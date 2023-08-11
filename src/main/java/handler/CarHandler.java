package handler;

import domain.Car;
import domain.Cars;
import view.ModelView;
import view.ViewName;

import java.util.List;
import java.util.stream.Collectors;

public class CarHandler {
    private static CarHandler instance = new CarHandler();

    private CarHandler() {
    }

    public static CarHandler getInstance() {
        return instance;
    }

    public ModelView handle(Cars cars, int n, Integer tryNum) {
        if (n == tryNum) {
            Cars winnerList = findWinners(cars);
            return new ModelView(ViewName.showFinish, winnerList);
        }

        for (Car car : cars.getCarList()) {
            car.tryMove();
        }
        return new ModelView(ViewName.showResult, cars);
    }

    private Cars findWinners(Cars cars) {
        int max = findMax(cars);
        List<Car> winners = cars.getCarList().stream().filter(car -> car.getPos() == max).collect(Collectors.toList());
        return Cars.create(winners);
    }

    private int findMax(Cars cars) {
        int max = Integer.MIN_VALUE;
        for (Car car : cars.getCarList()) {
            max = Math.max(max, car.getPos());
        }
        return max;
    }
}
