package Movable;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center = new MovablePoint();

    public MovableCircle() {
        this.radius = 0;
    }

    public MovableCircle(int radius) {
        this.radius = radius;
    }

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center.setX(x);
        center.setY(y);
        center.setxSpeed(xSpeed);
        center.setYSpeed(ySpeed);
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovableCircle(MovableCircle m) {
        this.radius = m.radius;
        this.center = m.center;
    }

    public boolean pointInisde(MovablePoint p) {
        return (center.distance(p) <= radius);
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }
}
