package week1.accessModifier;

public class TestStaticProperty {
    public static void main(String[] args) {

        StaticProperty car1 = new StaticProperty("Mazda 3","Skyactiv 3");
        System.out.println(StaticProperty.numberOfCar);
        StaticProperty car2 = new StaticProperty("Mazda 6","Skyactiv 6");
        System.out.println(StaticProperty.numberOfCar);
    }
}
