package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> carList = new ArrayList<>();

    public Cars(String... carNames) {
        for (String carName : carNames) {
            carList.add(new Car(carName));
        }
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public static Cars create(List<Car> carList) {
        Cars cars = new Cars();
        cars.setCarList(carList);
        return cars;
    }

    public void tryMove(MovingStrategy strategy) {
        for (Car car : this.carList) {
            car.tryMove(strategy);
        }
    }

    public Cars findWinners() {
        int max = findMax();
        List<Car> winners = this.carList.stream().filter(car -> car.getPos() == max).collect(Collectors.toList());
        return Cars.create(winners);
    }

    private int findMax() {
        int max = Integer.MIN_VALUE;
        for (Car car : this.carList) {
            max = Math.max(max, car.getPos());
        }
        return max;
    }

    public String getCurrent() {
        StringBuffer sb = new StringBuffer();
        for (Car car : carList) {
            sb.append(car.getResult());
        }
        return sb.toString();
    }

    public String getWinners() {
        StringBuffer sb = new StringBuffer(this.carList.get(0).getName());
        this.carList.stream().skip(1).forEach(car -> sb.append(", ").append(car.getName()));
        sb.append("가 최종 우승했습니다.");
        return sb.toString();
    }
}
