package carsrace;

import carsrace.domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {
    @Test
    @DisplayName("null 또는 빈 값 체크")
    void cat_name_null(){
        assertThatThrownBy(()-> new Car(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("차 이름의 빈값 또는 null 값을 입력할 수 없습니다.");

        assertThatThrownBy(()-> new Car(""))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("차 이름의 빈값 또는 null 값을 입력할 수 없습니다.");
    }

    @Test
    @DisplayName("차 이름이 5글자면 에러")
    void car_name_5글자(){
        assertThatThrownBy(()-> new Car("test51as"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("차 이름은 5글자를 초과할 수 없습니다.");
    }
}
