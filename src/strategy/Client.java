package strategy;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Maps maps=new Maps();
        maps.getPath("Chennai","Vizag",TravelModes.Car);
    }
}
