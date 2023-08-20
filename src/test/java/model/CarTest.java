package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarTest {

    @Test
    void 자동차가이름이있는가() {
        Car car = new Car(new Name("name"));
        assertThat(car.hasName()).isTrue();
    }


    @Test
    void 자동차가위치가있는가() {
        Car car = new Car(new Name("name"), new Location(1));
        assertThat(car.hasLocation());
    }

    @Test
    void 자동차가이동하는가(){
        Car car = new Car(new Name("name"));
        car.move(() -> true);
        assertThat(car.isGreaterThan(new Car(new Name("name"), new Location(0)))).isTrue();
    }


}
