import java.awt.*;
import java.util.List;

public class Cars {

    Car[] cars;
    String DELMINITOR = ",";

    public Cars(String names) {
        setCars(names);
    }

    private void setCars(String names) {
        String[] tokens = names.split(DELMINITOR);

        cars = new Car[tokens.length];
        for(int i = 0 ; i < tokens.length ; i++){
            cars[i] = new Car(tokens[i]);
        }

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
}
