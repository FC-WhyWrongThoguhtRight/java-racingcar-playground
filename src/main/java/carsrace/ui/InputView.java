package carsrace.ui;

import java.util.Scanner;

public class InputView {

    private static final Scanner input = new Scanner(System.in);
    private static final String ASK_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ASK_COUNT = "시도할 회수는 몇회인가요?";

    public static String askCarName(){
        System.out.println(ASK_CAR_NAME);
        return input.nextLine();
    }

    public static String askCount(){
        System.out.println(ASK_COUNT);
        return input.nextLine();
    }

}
