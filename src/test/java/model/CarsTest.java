package model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 자동차여러개를가지고있는가() {
        List<String> namesList = Arrays.asList("asdf","zxcv","qwer");
        Cars cars = new Cars(namesList);
        assertThat(cars.hasCar()).isTrue();
    }

    @Test
    void 자동차들을출발시키면전진하는가() {
        List<String> namesList = Arrays.asList("asdf","zxcv");
        Cars cars = new Cars(namesList);
        cars.move(() -> true);

        //테스트를 어케 해야하지..
    }
}
