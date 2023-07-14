package decorator;

public class VannilaCone implements IceCream{

    private IceCream iceCream;

    public VannilaCone() {

    }

    public VannilaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if (iceCream==null){
            return 50;
        }
        return iceCream.getCost()+40;
    }

    @Override
    public String desc() {
        if (iceCream==null){
            return "VannilaCone ";
        }
        return iceCream.desc()+"VannilaCone ";
    }
}
