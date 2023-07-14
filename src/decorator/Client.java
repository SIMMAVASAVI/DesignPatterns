package decorator;

public class Client {
    public static void main(String[] args) {
        IceCream ice= new VannilaChips(
                            new VannilaCone(
                                new ChoclateScoop(
                                    new ChoclateCone())));

        System.out.println(ice.desc()+"->"+ice.getCost());
    }
}
