package decorator;

public class VannilaChips implements IceCream{
    private IceCream iceCream;

    public VannilaChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    @Override
    public int getCost() {
        return iceCream.getCost()+30;
    }

    @Override
    public String desc() {
        return iceCream.desc()+"VannilaChips ";
    }
}
