package domain;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {
    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    @Override
    public boolean movable() {
        Random random = new Random();
        int randomNum = random.nextInt(MAX_BOUND);
        return randomNum >= FORWARD_NUM;
    }
}
