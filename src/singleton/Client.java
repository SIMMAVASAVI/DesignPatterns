package singleton;

public class Client {
    public static void main(String[] args) {

        //creation of objects to make connection - all the references will hold same object
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        Singleton s4=Singleton.getInstance();

        //making connection to the class - will not allow to make connection if count is
        //exceeded, as all the references holding the same object we can make count of connections made
        s1.makeConnection();
        s2.makeConnection();
        s3.makeConnection();
        s2.makeConnection();
        s4.makeConnection();


    }
}
