package decorator;

public class ChoclateCone implements IceCream{

    private IceCream iceCream;

    public ChoclateCone() {

    }

    public ChoclateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream==null){
            return 50;
        }
        return iceCream.getCost()+50;
    }

    @Override
    public String desc() {
        if (iceCream==null){
            return "ChoclateCone ";
        }
        return iceCream.desc()+"ChoclateCone ";

    }
}
