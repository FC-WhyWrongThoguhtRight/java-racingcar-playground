package domain;

public class Car {
    private static final int FORWARD_NUM = 4;

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

    public void tryMove(MovingStrategy strategy) {
        if (strategy.movable()) {
            this.pos++;
        }
    }

    public void tryMove(Integer ranNum) {
        if (ranNum >= FORWARD_NUM) {
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
