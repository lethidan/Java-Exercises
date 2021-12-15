package week1.accessModifier;

public class Circle {
    private double radiuss = 1.0;
    private String colors = "red";
    public Circle() {

    }

    public double getRadiuss() {
        return radiuss;
    }

    public String getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "Circless{" +
                "radiuss=" + radiuss +
                ", colors='" + colors + '\'' +
                '}';
    }
}
