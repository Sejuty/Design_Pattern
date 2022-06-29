package creational_pattern.factory_pattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();

        //get an object
        Shape shape1 =  shape.getShape("Circle");
        shape1.draw();

        Shape shape2 = shape.getShape("sQuare");
        shape2.draw();
    }
}
