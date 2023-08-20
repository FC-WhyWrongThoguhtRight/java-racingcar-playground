package carsrace.domain;

import carsrace.ui.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
List<Car> 를 일급컬렉션으로 감싸보자.
 */
public class Cars {
    public static final int BOUND = 9;
    private final List<Car> carList;

    public Cars(String names) {
        this.carList = splitName(names);
    }

    public Cars(List<Car> original) {
        this.carList = original;
    }

    private List<Car> splitName(String names) {
        List<Car> cars = new ArrayList<>();
        String carArr[] = names.split(",");

        for (String carName : carArr) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    public void moveCars() {
        for (Car car : this.carList) {
            car.moveCar(makeRandomNum());
            OutputView.printResult_Car(car);
        }
        System.out.println();
    }

    private Distance maxDistance() {
        Distance maxDistance = new Distance(1);
        for (Car car : carList) {
            maxDistance = car.maxDistance(maxDistance);
        }
        return maxDistance;
    }

    public List<Car> getWinnerList() {
        List<Car> winnerList = new ArrayList<>();
        Distance maxDistance = maxDistance();
        for (Car car : carList) {
            if (car.isWinner(maxDistance)) {
                winnerList.add(car);
            }
        }
        return winnerList;
    }

    private static int makeRandomNum() {
        Random random = new Random();
        //n 미만의 랜덤 정수 리턴 (1~9)
        return random.nextInt(BOUND) + 1;
    }
}
