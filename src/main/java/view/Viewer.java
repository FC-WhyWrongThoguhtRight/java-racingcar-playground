package view;

import domain.Cars;

import java.util.Scanner;

public class Viewer {
    private final Scanner sc = new Scanner(System.in);

    private static final Viewer instance = new Viewer();

    private Viewer() {
    }

    public static Viewer getInstance() {
        return instance;
    }

    public String[] getNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String s = sc.nextLine();

        return s.split(",");
    }

    public Integer getTryNum() {
        System.out.println("시도할 회수는 몇회인가요?");
        int num = sc.nextInt();

        return num;
    }

    public void showStartGame(Cars newCars) {
        System.out.println();
        System.out.println("실행 결과");
        showResult(newCars);
    }

    public void showResult(Cars cars) {
        System.out.println(cars.getCurrent());
    }

    public void showFinish(Cars winners) {
        System.out.println(winners.getWinners());
    }
}
