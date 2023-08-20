package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LocationTest {

    @Test
    void location이출력하면그만큼나오는가() {
        Location location = new Location(3);
        assertThat(location.toString()).isEqualTo("---");
    }
}
