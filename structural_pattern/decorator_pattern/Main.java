package structural_pattern.decorator_pattern;

public class Main {
    public static void main(String[] args) {
        Shape redRecTangle = new RedBorderAttribute(new Circle());
        redRecTangle.draw();

        Shape redSquare = new RedBorderAttribute(new Square());
        redSquare.draw();
    }
}
