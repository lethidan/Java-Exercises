package week1.inheritance.circleAndCylinder;

public class Circle {


    public double getArea() {
        return  radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
