package FlyWeight;

public class Client {
    public static void main(String[] args) {
        new BulletIntrinsic(12,"brown",12,3);
        Bullet bullet1=new Bullet(100,2,5,"north",BulletIntrinsic.getInstance());
        System.out.println(bullet1);
        //when we  want to change intrinsic values after a long time
        new BulletIntrinsic(15,"Blue",12,3);
        Bullet bullet2=new Bullet(200,5,7,"south",BulletIntrinsic.getInstance());
        System.out.println(bullet1);
        System.out.println(bullet2);
        System.out.println(BulletIntrinsic.getInstance());

    }

}
//FlyWeight.BulletIntrinsic@1d81eb93