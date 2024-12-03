package chapter8.lambdas;

public class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
