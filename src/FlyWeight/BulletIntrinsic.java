package FlyWeight;

public class BulletIntrinsic {

    // all are intrinsic variables which are same for all bullets

    private static BulletIntrinsic instance;
    int weight;
    String color;
    int length;
    int width;

    public BulletIntrinsic(int weight, String color, int length, int width) {
        BulletIntrinsic.getInstance();
        instance.weight = weight;
        instance.color = color;
        instance.length = length;
        instance.width = width;
    }

    private BulletIntrinsic(){

    }

    public static BulletIntrinsic getInstance() {
        if(instance==null){
            synchronized (BulletIntrinsic.class){
                if(instance==null){
                    instance=new BulletIntrinsic();
                }
            }
        }
        return instance;
    }

//    @Override
//    public String toString() {
//        return "BulletIntrinsic{" +
//                "weight=" + weight +
//                ", color='" + color + '\'' +
//                ", length=" + length +
//                ", width=" + width +
//                '}';
//    }
}
