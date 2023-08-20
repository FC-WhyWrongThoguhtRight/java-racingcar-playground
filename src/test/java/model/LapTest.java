package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LapTest {

    @Test
    void Lap이_값이있는가() {
        Lap l = new Lap(1);
        assertThat(l.size()).isGreaterThan(0);
    }

    @Test
    void lap이_1보다작으면_오류가나는가() {

        assertThatIllegalArgumentException().isThrownBy(() -> {
            Lap l = new Lap(0);
        }).withMessageMatching("랩의 숫자는 1이상 이어야 합니다.");

    }
}
