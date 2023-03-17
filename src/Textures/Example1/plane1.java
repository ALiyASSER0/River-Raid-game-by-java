package Textures.Example1;

public class plane1 {
    private final String firstPic="plane_1.png";
    private final String secendPic="plane_2.png";
    private final String triedPic="plane_3.png";
    private final double planeSpeed = .2;

    private final   String planeBoomed="plane_boom.png";

    private final String bulletPic="bullet.png";

    public plane1() {

    }
    public String getBulletPic() {
        return bulletPic;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public String getSecendPic() {
        return secendPic;
    }

    public String getTriedPic() {
        return triedPic;
    }
    public String getPlaneBoomed(){return planeBoomed;}

    public double getPlaneSpeed() {
        return planeSpeed;
    }
}
