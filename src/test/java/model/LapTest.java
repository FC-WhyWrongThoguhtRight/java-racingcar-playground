package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LapTest {

    @Test
    void Lap이_값이있는가() {
        Lap l = new Lap(1);
        assertThat(l.size()).isGreaterThan(0);
    }
}
