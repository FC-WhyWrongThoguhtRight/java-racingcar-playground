package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(List<Name> nameList){

        cars = new ArrayList<>();

        for(Name name : nameList){
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

    //어따써야하냐..
    public boolean isGraterThan(Cars cars2) {
        return true;
    }
}
