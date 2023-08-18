package view;

import java.util.Scanner;

public class GameView {


    public String printNameInput(Scanner sc) {
        System.out.println(Strings.askCarName);
        return sc.nextLine();
    }

    public int printAskLapCount(Scanner sc){
        System.out.println(Strings.asdfLapCount);
        return sc.nextInt();
    }
}
