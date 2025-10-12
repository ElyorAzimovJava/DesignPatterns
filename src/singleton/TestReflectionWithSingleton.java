package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflectionWithSingleton {
    public static void main(String[] args) {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = null;

        try {
            Constructor<SingletonThreadSafe> declaredConstructor = SingletonThreadSafe.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);

            instance2 = declaredConstructor.newInstance();

            System.out.println("The hashCode of instance1 is: " + instance1.hashCode());
            System.out.println("The hashCode of instance2 is: " + instance2.hashCode());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
