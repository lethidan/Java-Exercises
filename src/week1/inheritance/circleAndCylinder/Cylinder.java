package week1.inheritance.circleAndCylinder;

public class Cylinder extends Circle {
    private double height;


    public double getVolume(){
        return super.getArea()*height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
