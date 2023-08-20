package carsrace.service;

import carsrace.domain.Cars;
import carsrace.ui.InputView;
import carsrace.ui.OutputView;

import java.util.regex.Pattern;

public class CarRaceService {
    public static final Pattern NUMBER_REGEX = Pattern.compile("\\d+");
    public void startGame() {
        String names = InputView.askCarName();
        Cars cars = new Cars(names);

        String cntStr = InputView.askCount();

        if(!NUMBER_REGEX.matcher(cntStr).find()){
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }

        int cnt = Integer.parseInt(cntStr);

        judgeResult(cars, cnt);
    }

    public void judgeResult(Cars cars, int cnt) {
        OutputView.printResult();
        for (int i = 0; i < cnt; i++) {
            cars.moveCars();
        }
        //우승자 확인
        OutputView.printWinner(cars.getWinnerList());
    }
}
