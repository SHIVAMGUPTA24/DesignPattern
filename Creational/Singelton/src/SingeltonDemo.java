import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingeltonDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("Hi");
        // Print identity hash codes after creating first instance using getInstance()
        System.out.println("Normal Singleton instance hashCode: " + System.identityHashCode(EagerSingleton.getInstance()));
        Constructor<EagerSingleton> constructor = EagerSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EagerSingleton obj = constructor.newInstance();
        // Print identity hash codes after creating instance using reflection
        System.out.println("Normal Singleton instance hashCode: " + System.identityHashCode(obj));

        // Both hashcode will be different breaking singelton pattern


    }
}
