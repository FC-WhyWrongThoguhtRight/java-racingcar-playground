package carsrace;

import carsrace.domain.Distance;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistanceTest {

    @Test
    void distance(){
        Distance distance = new Distance();
        distance.addDistance();
        assertThat(distance).isEqualTo(new Distance(1));
    }
}
