package FlyWeight;

public class Bullet {

    //All are Extrinsic variables - that vary every time
    // always takes  shallow copy of the Intrinsic Class, which reduces the memory consumption is facade use

    int speed;
    int sourceCoOrdinate;
    int targetCoOrdinate;
    String direction;
    BulletIntrinsic bulletIntrinsic= BulletIntrinsic.getInstance();

    public Bullet(int speed, int sourceCoOrdinate, int targetCoOrdinate, String direction, BulletIntrinsic bulletIntrinsic) {
        this.speed = speed;
        this.sourceCoOrdinate = sourceCoOrdinate;
        this.targetCoOrdinate = targetCoOrdinate;
        this.direction = direction;
        this.bulletIntrinsic = bulletIntrinsic;
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "speed=" + speed +
                ", sourceCoOrdinate=" + sourceCoOrdinate +
                ", targetCoOrdinate=" + targetCoOrdinate +
                ", direction='" + direction + '\'' +
                ", bulletIntrinsic=" + bulletIntrinsic +
                '}';
    }
}
