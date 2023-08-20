import Model.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarTest {

    @Test
    void 자동차가이름이있는가() {
        Car car = new Car("name");
        assertThat(car.hasName()).isTrue();
    }

    @Test
    void 자동차이름이Null이면오류인가() {
        assertThatExceptionOfType(NullPointerException.class)
            .isThrownBy(() -> {
                Car car = new Car(null);
            }).withMessageMatching("name은 null이 아니어야 합니다.");
    }

    @Test
    void 자동차이름이_1자이하면_오류인가(){
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
            .isThrownBy(() -> {
                Car car = new Car("");
            }).withMessageMatching("이름은 1글자 이상 이어야 합니다.");
    }

    @Test
    void 자동차이름이_5자이상이면_오류인가() {
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    Car car = new Car("asdfasdf");
                }).withMessageMatching("이름은 5글자 이하 이여야 합니다.");
    }

    @Test
    void 자동차가위치가있는가() {
        Car car = new Car("name", 1);
        assertThat(car.hasLocation());
    }

    @Test
    void 자동차가이동하는가(){
        Car car = new Car("name");
        car.move(() -> true);
        assertThat(car.isGreaterThan(new Car("name", 0))).isTrue();
    }


}
