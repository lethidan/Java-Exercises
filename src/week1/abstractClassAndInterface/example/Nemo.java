package week1.abstractClassAndInterface.example;

public class Nemo extends Animal implements Swimable{
    @Override
    public String swim() {
        return "Nemo can swim";
    }
}
