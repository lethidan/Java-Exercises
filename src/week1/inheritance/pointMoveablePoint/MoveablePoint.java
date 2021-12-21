package week1.inheritance.pointMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    MoveablePoint() {

    }

    MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        setX(x);
        setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed() {
        return new float[] {xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "MoveAblePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MoveablePoint move() {
        float x = getX();
        float y = getY();
        x += xSpeed;
        y += ySpeed;
        setX(x);
        setY(y);
        return this;
    }
}
