package structural_pattern.adapter_pattern;

public class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("It can fly...");
    }

    @Override
    public void makeSound() {
        System.out.println("chirp...chirp...");
    }
}
