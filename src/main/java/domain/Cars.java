package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList = new ArrayList<>();

    public Cars(String... carNames) {
        for (String carName : carNames) {
            carList.add(new Car(carName));
        }
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public static Cars create(List<Car> carList) {
        Cars cars = new Cars();
        cars.setCarList(carList);
        return cars;
    }
}
