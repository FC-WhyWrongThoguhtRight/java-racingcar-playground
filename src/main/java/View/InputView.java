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
        System.out.println(RacingStrings.inputCarNames);
        return RacingGameUtil.splitNames(sc.nextLine());
    }

    public Lap scanLap(Scanner sc) {
        System.out.println(RacingStrings.inputLaps);
        return new Lap(sc.nextInt());
    }
}
