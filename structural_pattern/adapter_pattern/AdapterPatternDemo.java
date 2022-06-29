package structural_pattern.adapter_pattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Bird sparrow  = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        BirdAdapter birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow=>");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck=>");
        toyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter=>");
        birdAdapter.squeak();

    }
}
