package week1.accessModifier;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();

        StaticMethod s1 = new StaticMethod(111, "Hoang");
        StaticMethod s2 = new StaticMethod(222, "Khanh");
        StaticMethod s3 = new StaticMethod(333, "Na,");


        s1.display();
        s2.display();
        s3.display();
    }
}
