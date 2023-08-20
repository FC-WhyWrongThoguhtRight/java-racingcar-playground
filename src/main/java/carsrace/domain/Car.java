package carsrace.domain;

import java.util.Random;

public class Car {
    public static final int FORWARD_NUM = 4;

    private CarName carName;
    private Distance distance;

    public Car(String name) {
        this.carName = new CarName(name);
        this.distance = new Distance(0);
    }

    public Car(String name, int distance) {
        this.carName = new CarName(name);
        this.distance = new Distance(distance);
    }

    public String getCarName() {
        return carName.toString();
    }

    public void moveCar(int ranNum) {
        if (ranNum >= FORWARD_NUM) {
            distance.addDistance();
        }
    }

    public String getDistanceSign(){
        return distance.getSign();
    }

    public Distance maxDistance(Distance maxDistance){
        if (distance.lessThen(maxDistance)) {
             maxDistance = distance;
        }
        return maxDistance;
    }

    public boolean isWinner(Distance maxDistance){
        return distance.equals(maxDistance);
    }


}
