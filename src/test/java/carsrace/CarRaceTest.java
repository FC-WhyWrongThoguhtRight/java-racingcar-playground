package carsrace;

import carsrace.domain.Car;
import carsrace.domain.Cars;
import carsrace.domain.Distance;
import carsrace.service.CarRaceService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarRaceTest {

    @Test
    void findWinner(){
        Car pobi = new Car("pobi",3);
        Car crong = new Car("crong",3);
        Car honux = new Car("honux",4);
        List<Car> original = Arrays.asList(pobi,crong,honux);
        Cars cars = new Cars(original);
        assertThat(cars.getWinnerList()).contains(honux);
    }


}
