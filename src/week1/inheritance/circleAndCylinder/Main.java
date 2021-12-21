package week1.inheritance.circleandcylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius!");
        double radius = scanner.nextDouble();
        System.out.println("Enter color!");
        String color = scanner.next();

        circle.setRadius(radius);
        circle.setColor(color);


        cylinder.setColor(color);
        cylinder.setRadius(radius);
        cylinder.setHeight(4);



        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
        System.out.println("Area of circle is " + circle.getArea());
        System.out.println("Perimeter of circle is" + circle.getPerimeter());
        System.out.println("Volume of cylinder is " + cylinder.getVolume());


    }
}
