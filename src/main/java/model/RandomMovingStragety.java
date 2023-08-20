package model;

public class RandomMovingStragety implements MovingStrategy{
    @Override
    public boolean isMovable() {
        return (Math.random() * 10) >= 4;
    }
}
