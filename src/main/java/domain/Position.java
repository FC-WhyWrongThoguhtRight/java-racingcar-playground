package domain;

public class Position {
    private int pos;

    public Position(int pos) {
        this.pos = pos;
    }

    public Position move() {
        pos = pos + 1;
        return this;
    }

    public int value() {
        return pos;
    }
}
