import java.util.Arrays;

public class Point {
    protected double x;
    protected double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double[] getXY(){
        return new double[] {this.getX(),this.getY()};
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return Arrays.toString(this.getXY());
    }
}
