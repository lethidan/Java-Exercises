package week1.inheritance.circleandcylinder;

public class Cylinder extends Circle{

//    public Cylinder(double radius, String color) {
//        super(radius, color);
//    }

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "radius=" + getRadius() +
                "color=" + getColor() +
                '}';
    }
}
