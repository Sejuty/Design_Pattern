package structural_pattern.decorator_pattern;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("shape: circle");
    }
}
