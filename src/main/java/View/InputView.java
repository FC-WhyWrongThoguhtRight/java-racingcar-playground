package View;

import controller.RacingGameUtil;
import model.Lap;
import model.Name;

import java.util.List;
import java.util.Scanner;

public class InputView {

    static InputView inputView;

    public static InputView getInstance(){
        if(inputView == null){
            inputView = new InputView();
        }
        return inputView;
    }



    public List<Name> scanCarNames(Scanner sc){
        System.out.print("경주 할 자동차 이름을 입력하세요");
        System.out.println("(이름은 쉼표(,)를 기준으로 구분");
        return RacingGameUtil.splitNames(sc.nextLine());
    }

    public Lap scanLap(Scanner sc) {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return new Lap(sc.nextInt());
    }
}
