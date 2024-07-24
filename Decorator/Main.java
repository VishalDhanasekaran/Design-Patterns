public class Main 
{
    public static void main(String[] args) 
    {
        Shape circle = ShapeFactory.createCircle();
        Shape coloredShape = ShapeFactory.createColoredShape("red", circle);
        System.out.println(coloredShape.getName());
    }
}
