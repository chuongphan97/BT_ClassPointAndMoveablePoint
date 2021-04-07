public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(10,20,0,0);
        movablePoint.setSpeed(19,30);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());

        movablePoint.setSpeed(10,35);
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
