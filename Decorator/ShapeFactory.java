public class ShapeFactory 
{
    public static Shape createCircle() 
    {
        return new Circle();
    }

    public static Shape createColoredShape(String color, Shape shape) 
    {
        return new ColoredShape(color, shape);
    }
};
