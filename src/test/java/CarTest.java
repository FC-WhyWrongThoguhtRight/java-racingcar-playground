import model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarTest {

    Car car;
    String name = "zxcv";
    String longName = "zxcvzxcv";

    @BeforeEach
    void setUp(){
        car = new Car(name);
    }

    @Test
    void 자동차가_이름이_있나(){
        car = new Car(name);
        String name = car.getName();
        assertThat(name).isEqualTo("zxcv");
    }

    @Test
    void 자동차가_5자_이상_오류를_내는가(){
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
            .isThrownBy(()->{
                car = new Car(longName);
            }).withMessageMatching("length : \\d+");
    }

    @Test
    void 자동차가_랜덤하게_앞으로_전진하는가(){
        car.run();
        assertThat(car.getLocation()).isGreaterThan(0);
    }

}
