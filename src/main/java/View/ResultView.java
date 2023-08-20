package View;

import model.Car;
import model.Cars;

import java.util.List;

public class ResultView {

    private static ResultView resultView;

    public static ResultView getInstance(){
        if(resultView == null){
            resultView = new ResultView();
        }
        return resultView;
    }

    public void printCurrentRace(Cars cars) {
        System.out.println(cars.toString());
    }

    private void printCurrentLocation(Car car) {
    }

    public void printResult() {
        System.out.println(RacingStrings.runResult);
    }

    public void printWinners(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        for(Car car : winners){
            sb.append(car.nameToStrings()).append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(RacingStrings.winner);
        System.out.println(sb.toString());
    }
}
