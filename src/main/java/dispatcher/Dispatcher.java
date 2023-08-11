package dispatcher;

import domain.Cars;
import handler.CarHandler;
import view.ModelView;
import view.Viewer;

import java.lang.reflect.InvocationTargetException;

public class Dispatcher {
    private final CarHandler carHandler;
    private final Viewer viewer;

    private static final Dispatcher instance = new Dispatcher(CarHandler.getInstance(), Viewer.getInstance());

    private Dispatcher(CarHandler carHandler, Viewer viewer) {
        this.carHandler = carHandler;
        this.viewer = viewer;
    }

    public static Dispatcher getInstance() {
        return instance;
    }

    public void service() throws InvocationTargetException, IllegalAccessException {
        String[] names = viewer.getNames();
        Integer tryNum = viewer.getTryNum();

        Cars newCars = new Cars(names);
        viewer.showStartGame(newCars);

        for (int n = 0; n <= tryNum; n++) {
            ModelView mv = carHandler.handle(newCars, n, tryNum);
            mv.render();
        }
    }
}
