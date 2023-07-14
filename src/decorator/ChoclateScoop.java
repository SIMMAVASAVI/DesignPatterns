package decorator;

public class ChoclateScoop implements IceCream {

    private IceCream iceCream;

    public ChoclateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    @Override
    public int getCost() {
        return iceCream.getCost()+20;
    }

    @Override
    public String desc() {
        return iceCream.desc()+"ChoclateScoop ";
    }
}
