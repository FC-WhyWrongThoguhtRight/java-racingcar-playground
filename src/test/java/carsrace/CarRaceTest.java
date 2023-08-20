package carsrace;

import carsrace.domain.Car;
import carsrace.service.CarRaceService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarRaceTest {

    @Test
    @DisplayName("차 이름이 5글자면 에러")
    void car_name_5글자(){
        assertThatThrownBy(()-> new Car("test51as"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("차 이름은 5글짜를 초과할 수 없습니다.");
    }

    @Test
    void car_쉽표구분자(){
        String result = "pobi,crong,honux";

        /*List<Car> carList = CarRaceService.splitName(result);

        assertThat(carList.get(0).getName()).isEqualTo("pobi");
        assertThat(carList.get(1).getName()).isEqualTo("crong");
        assertThat(carList.get(2).getName()).isEqualTo("honux");*/
    }

    @Test
    void car_전진(){
        //Car car = new Car("test");
        //CarRaceService.moveCar(car);
    }

    @Test
    void car_전진_최종(){
        CarRaceService carRaceService = new CarRaceService();
        //carRaceService.judgeResult("pobi,crong,honux",5);
    }
}
