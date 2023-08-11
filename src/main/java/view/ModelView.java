package view;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModelView {
    private ViewName viewName;
    private Object model;

    public ModelView(ViewName viewName, Object model) {
        this.viewName = viewName;
        this.model = model;
    }

    public void render() throws InvocationTargetException, IllegalAccessException {
        Viewer viewer = Viewer.getInstance();
        Method[] declaredMethods = Viewer.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName() == this.viewName.name()) {
                declaredMethod.invoke(viewer, model);
            }
        }
    }
}
