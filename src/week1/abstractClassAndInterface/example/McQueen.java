package week1.abstractClassAndInterface.example;

public class McQueen extends Machine implements Runable {
    @Override
    public String run() {
        return "McQeen can run";
    }
}
