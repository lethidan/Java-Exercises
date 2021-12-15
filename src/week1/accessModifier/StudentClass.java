package week1.accessModifier;

public class StudentClass {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getNames());
        System.out.println(student.getClasses());
        student.setNames("dan");
        student.setClasses("C1021");
        System.out.println(student.getNames());
        System.out.println(student.getClasses());
    }

}
