package singleton;

public class SingletonMultiThreaded {

    private static SingletonMultiThreaded instance;

    private SingletonMultiThreaded(){

    }

    public static SingletonMultiThreaded getInstance(){
        // double check locking for multithreaded
        if(instance==null){
            synchronized (SingletonMultiThreaded.class) {
                if(instance==null) {
                    instance = new SingletonMultiThreaded();
                }
            }
        }
        return instance;

    }
}
