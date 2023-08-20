package carsrace.domain;

import java.util.regex.Pattern;

public class Distance {
    private int distance;

    public Distance() {
        this.distance = 0;
    }

    public void plusDistance() {
        this.distance++;
    }

    public int getDistance() {
        return distance;
    }
}
