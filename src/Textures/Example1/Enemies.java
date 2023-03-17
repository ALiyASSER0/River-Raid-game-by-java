package Textures.Example1;

public class Enemies {
    long start, lifeTime;
    public double x, y;
    boolean create;
    double initX, initY;
    private final String firstPic="boat1.png";
    private final String secendPic="boat2.png";
    public Enemies(){
    }
    public Enemies( double x, double y, int lifetime){
        this.x = initX = x;
        this.y = initY = y+100;
        this.create = true;
        start = System.currentTimeMillis();
        lifeTime = lifetime;
    }
    public void validate(){
        create = start+lifeTime > System.currentTimeMillis();
    }
    public String getFirstPic() {
        return firstPic;
    }

    public String getSecendPic() {
        return secendPic;
    }
}
