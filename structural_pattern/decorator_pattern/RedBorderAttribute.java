package structural_pattern.decorator_pattern;

public class RedBorderAttribute extends DecoratedShape {


    public RedBorderAttribute(Shape decoratedShape) {
        super(decoratedShape);
    }
    public void draw()
    {
        super.draw();
        setBorderColor();
    }
    private void setBorderColor()
    {
        System.out.println("Border: Red");
    }
}
