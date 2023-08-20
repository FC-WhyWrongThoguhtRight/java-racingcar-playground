package View;

import java.util.Scanner;

public class InputView {

    static InputView inputView;

    public static InputView getInstance(){
        if(inputView == null){
            inputView = new InputView();
        }
        return inputView;
    }



    public String scanCarNames(Scanner sc){
        System.out.print("경주 할 자동차 이름을 입력하세요");
        System.out.println("(이름은 쉼표(,)를 기준으로 구분");
        return sc.nextLine();
    }

    public int scanLap(Scanner sc) {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }
}
