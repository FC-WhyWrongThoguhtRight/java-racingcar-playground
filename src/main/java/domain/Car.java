package domain;

public class Car {
    private final Name name;
    private final Position pos;

    public Car(String name) {
        this.name = new Name(name);
        this.pos = new Position(1);
    }

    public String getName() {
        return name.value();
    }

    public int getPos() {
        return pos.value();
    }

    public void tryMove(MovingStrategy strategy) {
        if (strategy.movable()) {
            pos.move();
        }
    }

    public String getResult() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.name.value()).append(" : ");
        for (int i = 0; i < pos.value(); i++) {
            sb.append("-");
        }
        sb.append('\n');
        return sb.toString();
    }
}
