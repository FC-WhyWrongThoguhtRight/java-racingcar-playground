package Model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(List<String> nameList){

        cars = new ArrayList<>();

        for(String name : nameList){
            cars.add(new Car(name));
        }

    }

    public boolean hasCar() {
        if(cars == null){
            return false;
        }
        return cars.size() > 0;
    }

    public void move(MovingStrategy ms) {
        for (Car car : cars) {
            car.move(ms);
        }
    }

}
