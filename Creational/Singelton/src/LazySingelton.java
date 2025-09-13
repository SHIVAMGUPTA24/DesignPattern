//Pros Instance is created only when needed, can handle exceptions during instantiation.
//Cons -Not thread-safe without synchronization, requires additional handling for multithreading.
public class LazySingelton {
    private  static  LazySingelton instance;

    private LazySingelton(){

    }
    public  static  LazySingelton getInstance(){
        if(instance ==null){
            instance=new LazySingelton();
        }
        return instance;
    }
}
