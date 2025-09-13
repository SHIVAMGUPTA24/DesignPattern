// A basic implementation of the Singleton design pattern in Java.
//Pros -No Lazy Initialization issues., thread-safe without synchronization.
//Cons -Instance is created even if the client application might not be using it.
// Usage -When the singleton instance is lightweight and the application always uses it.
//cannot handle exception While initalizing the instance.
//Not suitable if creation is expensive, requires parameters, or needs reflection safety.
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}