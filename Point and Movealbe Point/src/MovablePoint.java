import java.util.Arrays;

public class MovablePoint extends Point{
    private double xSpeed;
    private double ySpeed;
    public MovablePoint(){

    }
    public MovablePoint(double x, double y, double xSpeed, double ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(double xSpeed, double ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public double[] getSpeed(){
        return new double[] {this.getXSpeed(),this.getYSpeed()};
    }
    public String toString(){
        return    super.toString() + " speed = " + Arrays.toString(this.getSpeed());
    }
    public MovablePoint move(){
        this.x += this.getXSpeed();
        this.y += this.getYSpeed();
        return this;
    }
}
