package strategy;

public class PathCalculatorFactory {

    public static PathCalculatorSrategy getInstance(TravelModes Mode){
        return switch (Mode){
            case Car-> CarPathCalculatorStrategy.getInstance();
            case Bike-> BikePathCalculatorStrategy.getInstance();
            case Walk-> WalkPathCalculatorStrategy.getInstance();
            default -> null;
        };

    }
}
