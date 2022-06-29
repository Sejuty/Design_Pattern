package creational_pattern.factory_pattern;

public class ShapeFactory {
    Shape getShape(String s) {
        if (s == null)
            return null;
        if (s.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (s.equalsIgnoreCase("Square"))
            return new Square();
        else if (s.equalsIgnoreCase("Triangle"))
            return new Triangle();
        return null;
    }
}
