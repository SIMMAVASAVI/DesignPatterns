package singleton;

public class Singleton {

    private static Singleton instance;

    private int counter;

    private Singleton (){

    }

    public static Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }

    public void makeConnection(){
        if(counter<3){
            counter++;
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
