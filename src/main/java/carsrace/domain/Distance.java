package carsrace.domain;

import java.util.Objects;

public class Distance {
    private int distance;

    public Distance() {
        this(0);
    }

    public Distance(int distance) {
        this.distance = distance;
    }

    public void addDistance() {
        this.distance++;
    }

    public String getSign(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < distance; i++){
            sb.append("-");
        }

        return sb.toString();
    }

    public int maxDistance(int maxDistance){
        if (distance >= maxDistance) {
            maxDistance = distance;
        }
        return maxDistance;
    }

    public boolean lessThen(Distance maxDistance) {
        if(distance >= maxDistance.distance){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }
}
