package model;

public class Lap {
    int lap;

    public Lap(int lap) {
        if(lap < 1){
            throw new IllegalArgumentException("랩의 숫자는 1이상 이어야 합니다.");
        }
        this.lap = lap;
    }

    public int size() {
        return lap;
    }

    public boolean isEmpty() {
        return lap == 0;
    }
}
