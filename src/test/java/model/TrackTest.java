package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class TrackTest {

    Track track;
    @BeforeEach
    void setup(){
        track = new Track(new Cars(Arrays.asList("zxcv","asdf")), new Lap(5));
    }

    @Test
    void 트랙에차들이있는가() {
        assertThat(track.hasCars()).isTrue();
    }

    @Test
    void 트랙은랩수가있는가() {
        assertThat(track.hasLap()).isTrue();
    }
}
