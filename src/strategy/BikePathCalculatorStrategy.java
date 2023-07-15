package strategy;

public class BikePathCalculatorStrategy implements PathCalculatorSrategy{

    private static BikePathCalculatorStrategy bikePathCalculatorStrategy;
    private BikePathCalculatorStrategy() {
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculator via Bike from "+ source+" to"+ destination );
    }
    public static  BikePathCalculatorStrategy getInstance(){
        if (bikePathCalculatorStrategy==null){
            synchronized (BikePathCalculatorStrategy.class) {
                if (bikePathCalculatorStrategy == null) {
                    bikePathCalculatorStrategy= new BikePathCalculatorStrategy();
                }
            }
        }
        return bikePathCalculatorStrategy;
    }


}
