package strategy;

public class CarPathCalculatorStrategy implements PathCalculatorSrategy{

    private static CarPathCalculatorStrategy carPathCalculatorStrategy;
    private CarPathCalculatorStrategy() {
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculator via Car from "+ source+" to"+ destination );
    }
    public static CarPathCalculatorStrategy getInstance(){
        if (carPathCalculatorStrategy==null){
            synchronized (CarPathCalculatorStrategy.class) {
                if (carPathCalculatorStrategy == null) {
                    carPathCalculatorStrategy= new CarPathCalculatorStrategy();
                }
            }
        }
        return carPathCalculatorStrategy;
    }


}
