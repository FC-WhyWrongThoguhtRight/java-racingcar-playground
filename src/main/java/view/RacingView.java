package view;

import model.Car;
import model.Cars;

import java.util.List;

public class RacingView {

    private static RacingView rv;

    public static RacingView getInstance() {
        if(rv == null){
            rv = new RacingView();
        }
        return rv;
    }

    public void printRunResultText(){
        System.out.println(Strings.runResult);
    }

    public void printRacingStatus(Cars cars){
        StringBuilder sb = new StringBuilder();
        for(Car car : cars.getCars()){
            sb.append(car.getName()).append(" : ");
            for(int i = 0 ; i < car.getLocation() ; i++){
                sb.append("-");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public void printWinner(List<String> winner){
        StringBuilder sb = new StringBuilder();
        for(String name : winner){
            sb.append(name).append(", ");
        }
        sb.delete(sb.length()-2, sb.length()).append(Strings.winner);
        System.out.println(sb.toString());
    }

}
