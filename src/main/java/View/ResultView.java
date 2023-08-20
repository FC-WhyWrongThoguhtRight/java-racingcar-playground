package View;

import model.Cars;

public class ResultView {

    private static ResultView resultView;

    public static ResultView getInstance(){
        if(resultView == null){
            resultView = new ResultView();
        }
        return resultView;
    }

    public void printCurrentRace(Cars cars) {



    }
}
