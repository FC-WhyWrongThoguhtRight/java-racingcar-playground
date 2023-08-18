import model.Cars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    Cars cars;
    String names = "qwer,asdf,zxcv";

    @BeforeEach
    void setup(){
        cars = new Cars(names);
    }

    @Test
    void 자동차가_3개인가(){
        int count = cars.size();
        assertThat(count).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    void 모든자동차가_이동하는가(int num){
        cars.run();
        int location = cars.get(num).getLocation();
        assertThat(location).isGreaterThan(0);
    }



}
