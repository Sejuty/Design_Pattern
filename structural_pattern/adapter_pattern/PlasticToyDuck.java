package structural_pattern.adapter_pattern;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("Squeak...");
    }
}
