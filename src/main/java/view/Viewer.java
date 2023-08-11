package view;

import domain.Car;
import domain.Cars;

import java.util.List;
import java.util.Scanner;

public class Viewer {
    private Scanner sc = new Scanner(System.in);

    private static Viewer instance = new Viewer();

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
        StringBuffer sb = new StringBuffer();
        for (Car car : cars.getCarList()) {
            sb.append(car.getResult());
        }
        System.out.println(sb);
    }

    public void showFinish(Cars winners) {
        List<Car> winnerList = winners.getCarList();
        StringBuffer sb = new StringBuffer(winnerList.get(0).getName());
        winnerList.stream().skip(1).forEach(car -> sb.append(", ").append(car.getName()));
        sb.append("가 최종 우승했습니다.");
        System.out.println(sb);
    }
}
