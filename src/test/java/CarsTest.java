import Model.Cars;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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


}
