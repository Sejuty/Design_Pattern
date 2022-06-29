package structural_pattern.decorator_pattern;

public class DecoratedShape implements Shape {
    Shape decoratedShape;

    public DecoratedShape(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
