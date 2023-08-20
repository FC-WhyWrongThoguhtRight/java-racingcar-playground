package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    List<Car> cars;

    public Cars(List<Name> nameList){

        cars = new ArrayList<>();

        for(Name name : nameList){
            cars.add(new Car(name) );
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


    public List<Car> getWinner() {
        Location max = findMaxLocation();

        List<Car> winners = findWinner(max);

        return winners;
    }

    private List<Car> findWinner(Location max) {
        List<Car> winnerList = new ArrayList<>();
        for(Car car : cars){
            if(car.isWinner(max)){
                winnerList.add(car);
            }
        }
        return winnerList;
    }

    private Location findMaxLocation() {
        Location maxLocation = new Location(0);
        for(Car car : cars){
            maxLocation = car.getBiggerLocation(maxLocation);
        }
        return maxLocation;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Car cars : cars){
            sb.append(cars.toString()).append("\n");
        }
        return sb.toString();
    }

}
