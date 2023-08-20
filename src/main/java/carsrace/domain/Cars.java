package carsrace.domain;

import carsrace.ui.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
List<Car> 를 일급컬렉션으로 감싸보자.
 */
public class Cars {
    private final List<Car> carList;

    public Cars(String names) {
        this.carList = splitName(names);
    }

    private List<Car> splitName(String names) {
        List<Car> cars = new ArrayList<>();
        String carArr[] = names.split(",");

        for (String carName : carArr) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    private static int makeRandomNum() {
        Random random = new Random();
        //n 미만의 랜덤 정수 리턴 (1~9)
        return random.nextInt(9) + 1;
    }

    private static void moveCar(Car car) {
        int ranNum = makeRandomNum();

        if (ranNum >= 4) {
            car.addDistance();
        }
    }

    public void moveCars() {
        for (Car car : this.carList) {
            moveCar(car);
            OutputView.printResult_Car(car);
        }
        System.out.println();
    }

    private int maxDistance() {
        int maxDistance = 0;
        for (Car car : carList) {
            if (car.getDistance().getDistance() >= maxDistance) {
                maxDistance = car.getDistance().getDistance();
            }
        }
        return maxDistance;
    }

    public List<Car> getWinnerList() {
        List<Car> winnerList = new ArrayList<>();
        int maxDistance = maxDistance();
        for (Car car : carList) {
            if (car.getDistance().getDistance() == maxDistance) {
                winnerList.add(car);
            }
        }
        return winnerList;
    }


}
