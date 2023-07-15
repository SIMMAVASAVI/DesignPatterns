package strategy;

public class Maps {

    public void getPath(String source, String destination,TravelModes mode){
        PathCalculatorSrategy pathCalculatorSrategy=PathCalculatorFactory.getInstance(mode);
        pathCalculatorSrategy.findPath(source,destination);
    }


}
