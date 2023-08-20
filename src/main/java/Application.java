import controller.RacingGame;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RacingGame rg = new RacingGame(sc);
        rg.play();
    }
}
