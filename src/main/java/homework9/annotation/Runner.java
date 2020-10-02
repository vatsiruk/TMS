package homework9.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (MyService.class.isAnnotationPresent(Version.class)) {
            MyService myService = new MyService("Vasya", 7);

            Method thisClassInfo = MyService.class.getDeclaredMethod("thisClassInfo");
            thisClassInfo.setAccessible(true);
            thisClassInfo.invoke(myService);
        } else {
            System.out.println("MyService не помечен @Version");
        }
    }
}
