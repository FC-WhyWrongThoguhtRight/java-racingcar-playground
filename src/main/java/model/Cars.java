package model;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Cars{

    Car[] cars;
    String DELIMINATOR = ",";

    public Cars(String names) {
        setCars(names);
    }

    private void setCars(String names) {
        String[] tokens = names.split(DELIMINATOR);

        cars = new Car[tokens.length];
        for(int i = 0 ; i < tokens.length ; i++){
            cars[i] = new Car(tokens[i]);
        }

    }

    public Car[] getCars(){
        return cars;
    }

    public int size() {
        if(cars == null)
            return 0;

        return cars.length;
    }

    public void run() {
        for(int i = 0 ; i < cars.length ; i++){
            this.get(i).run();
        }
    }

    public Car get(int num) {
        return cars[num];
    }

    public int getMaxLocation() {
        int max = -1;
        for(Car car : cars){
            max = Math.max(car.getLocation(), max);
        }
        return max;
    }
}
