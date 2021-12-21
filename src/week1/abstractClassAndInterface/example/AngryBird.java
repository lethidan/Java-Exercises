package week1.abstractClassAndInterface.example;

public class AngryBird extends Animal implements Flyable{

    @Override
    public String fly() {
        return "Angry Bird can fly";
    }
}
