package strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorSrategy{

    private static WalkPathCalculatorStrategy walkPathCalculatorStrategy;
    private WalkPathCalculatorStrategy() {
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculator via walk from "+ source+" to"+ destination );
    }
    public static WalkPathCalculatorStrategy getInstance(){
        if (walkPathCalculatorStrategy==null){
            synchronized (WalkPathCalculatorStrategy.class) {
                if (walkPathCalculatorStrategy == null) {
                    walkPathCalculatorStrategy= new WalkPathCalculatorStrategy();
                }
            }
        }
        return walkPathCalculatorStrategy;
    }


}
