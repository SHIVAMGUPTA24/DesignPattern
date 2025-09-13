//Pros Instance is created only when needed, can handle exceptions during instantiation.
//Cons -Not thread-safe without synchronization, requires additional handling for multithreading.

public class LazySingleton {
    private  static  LazySingleton instance;

    private LazySingleton(){

    }
    public  static  LazySingleton getInstance(){
        if(instance ==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
