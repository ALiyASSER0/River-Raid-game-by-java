package Textures.Example1;

public class Bullet {
    long start, lifeTime;
    double x, y;
    boolean fired;
    double initX, initY;
    public Bullet( double x, double y, int lifetime){
        this.x = initX = x;
        this.y = initY = y+5;
        this.fired = true;
        start = System.currentTimeMillis();
        lifeTime = lifetime;
    }
    public void invalidate(){
        fired = start+lifeTime > System.currentTimeMillis();
    }


}
