package model;

import controller.RacingGameUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class TrackTest {

    Track track;
    @BeforeEach
    void setup(){
        track = new Track(new Cars(RacingGameUtil.splitNames("qwer,asdf")), new Lap(5));
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
