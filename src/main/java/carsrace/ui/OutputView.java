package carsrace.ui;

import carsrace.domain.Car;

import java.util.List;

public class OutputView {

    private static final String RESULT_MESSAGE = "\n실행결과";
    private static final String COLON = " : ";
    private static final String WINNER = "가 최종 우승했습니다.";

    public static void printResult(){
        System.out.println(RESULT_MESSAGE);
    }

    public static void printResult_Car(Car car){
        System.out.println(car.getCarName() + COLON + car.getDistanceSign());
    }

    public static void printWinner(List<Car> winnerList) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < winnerList.size(); i++){
            sb.append(winnerList.get(i).getCarName());
            if(i != (winnerList.size()-1)){
                sb.append(", ");
            }
        }
        System.out.println(sb+WINNER);
    }


}
