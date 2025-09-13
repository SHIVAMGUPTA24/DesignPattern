import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingeltonDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Print identity hash codes after creating first instance using getInstance()
        System.out.println("Normal Singleton instance hashCode: " + System.identityHashCode(EagerSingleton.getInstance()));
        Constructor<EagerSingleton> constructor = EagerSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EagerSingleton obj = constructor.newInstance();
        // Print identity hash codes after creating instance using reflection
        System.out.println("Reflection Singleton instance hashCode: " + System.identityHashCode(obj));

        // Both hashcode will be different breaking singelton pattern
        //================
        Runnable taskForLazy = () -> {
            LazySingelton lazySingelton =LazySingelton.getInstance();
            System.out.println(Thread.currentThread().getName()  +  " Lazy Initialization :  " + System.identityHashCode(lazySingelton));
        };
        Thread t1 =new Thread(taskForLazy);
        Thread t2 =new Thread(taskForLazy);
        t1.start();
        t2.start();

    }
}
/** This was Printed on my console
Normal Singleton instance hashCode: 1791741888
Reflection Singleton instance hashCode: 883049899
Thread-0 Lazy Initialization :  436160393
Thread-1 Lazy Initialization :  436160393
 **/

