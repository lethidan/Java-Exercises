package week1.classAndObject;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    public int speed = SLOW;
    public boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public Fan() {

    }

    public String toString() {
        if (isOn()) {
            return "Speed:" + getSpeed() + "Radius: " + getRadius() + "Color" + getColor() + "Fan is on";

        } else {

            return "Radius: " + getRadius() + "Color" + getColor() + "Fan is off";
        }
    }
}
