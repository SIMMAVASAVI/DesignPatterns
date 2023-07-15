package FlyWeight;

public class BulletIntrinsic {

    // all are intrinsic variables which are same for all bullets

    private static BulletIntrinsic instance;
    int weight=12;
    String color="blue";
    int length=4;
    int width=3;

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
