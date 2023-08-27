//package handler;
//
//import domain.Car;
//import domain.Cars;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import view.ModelView;
//import view.ViewName;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class CarHandlerTest {
//    CarHandler carHandler = CarHandler.getInstance();
//
//    @ParameterizedTest
//    @CsvSource(value = {"a-1,b-2,c-3,d-2,e-1:c"}, delimiter = ':')
//    void findWinnersTest(String carNamesAndPos, String winnerName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        String[] cars = carNamesAndPos.split(",");
//        ArrayList<Car> carList = new ArrayList<>();
//        for (String carStr : cars) {
//            String[] split = carStr.split("-");
//            Car car = new Car(split[0]);
//            car.setPos(Integer.parseInt(split[1]));
//            carList.add(car);
//        }
//        Method findWinners = CarHandler.class.getDeclaredMethod("findWinners", Cars.class);
//        findWinners.setAccessible(true);
//        Object result = findWinners.invoke(carHandler, Cars.create(carList));
//        assertThat(result).isInstanceOf(Cars.class);
//
//        String[] winnerCars = winnerName.split("");
//        assertThat(((Cars) result).getCarList().stream().map(Car::getName).toArray(String[]::new))
//                .containsExactly(winnerCars);
//    }
//
//    @ParameterizedTest
//    @CsvSource(value = {"a-1,b-2,c-3,d-2,e-1:3:5"}, delimiter = ':')
//    void handleResultTest(String carNamesAndPos, Integer num, Integer tryNum) throws NoSuchFieldException, IllegalAccessException {
//        String[] cars = carNamesAndPos.split(",");
//        ArrayList<Car> carList = new ArrayList<>();
//        for (String carStr : cars) {
//            String[] split = carStr.split("-");
//            Car car = new Car(split[0]);
//            car.setPos(Integer.parseInt(split[1]));
//            carList.add(car);
//        }
//
//        ModelView mv = carHandler.handle(Cars.create(carList), num, tryNum);
//
//        Field viewNameField = ModelView.class.getDeclaredField("viewName");
//        viewNameField.setAccessible(true);
//
//        Object viewName = viewNameField.get(mv);
//        assertThat(viewName).isInstanceOf(ViewName.class);
//
//        assertThat(((ViewName) viewName).name()).isEqualTo("showResult");
//    }
//
//    @ParameterizedTest
//    @CsvSource(value = {"a-1,b-2,c-3,d-2,e-1:5:5"}, delimiter = ':')
//    void handleFinishTest(String carNamesAndPos, Integer num, Integer tryNum) throws NoSuchFieldException, IllegalAccessException {
//        String[] cars = carNamesAndPos.split(",");
//        ArrayList<Car> carList = new ArrayList<>();
//        for (String carStr : cars) {
//            String[] split = carStr.split("-");
//            Car car = new Car(split[0]);
//            car.setPos(Integer.parseInt(split[1]));
//            carList.add(car);
//        }
//
//        ModelView mv = carHandler.handle(Cars.create(carList), num, tryNum);
//
//        Field viewNameField = ModelView.class.getDeclaredField("viewName");
//        viewNameField.setAccessible(true);
//
//        Object viewName = viewNameField.get(mv);
//        assertThat(viewName).isInstanceOf(ViewName.class);
//
//        assertThat(((ViewName) viewName).name()).isEqualTo("showFinish");
//    }
//}