package week1.abstractClassAndInterface.example;

public class Bolt extends Animal implements Barkable, Runable {
    @Override
    public String bark() {
        return "Bolt can bark";
    }

    @Override
    public String run() {
        return "Bolt can run";
    }
}
