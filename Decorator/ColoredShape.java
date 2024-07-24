public class ColoredShape implements Shape 
{
    private String color;
    private Shape shape;

    public ColoredShape(String color, Shape shape) 
    {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String getName() 
    {
        return shape.getName() + " which is colored " + color;
    }
};
