package domain;

public class Position {
    private int pos;

    public Position(int pos) {
        this.pos = pos;
    }

    public void move() {
        pos = pos + 1;
    }

    public int value() {
        return pos;
    }
}
