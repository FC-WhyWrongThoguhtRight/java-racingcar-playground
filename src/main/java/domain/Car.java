package domain;

import java.util.Random;

public class Car {
    private final String name;
    private Integer pos;

    public Car(String name) {
        this.name = name;
        this.pos = 1;
    }

    public String getName() {
        return name;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public void tryMove() {
        Random random = new Random();
        int ranNum = random.nextInt(10);
        if (ranNum >= 4) {
            this.pos++;
        }
    }

    public String getResult() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.name).append(" : ");
        for (int i = 0; i < pos; i++) {
            sb.append("-");
        }
        sb.append('\n');
        return sb.toString();
    }
}
