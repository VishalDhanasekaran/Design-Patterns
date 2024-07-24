public class Circle implements Shape 
{
    private float radius = 10.0f;

    public void resize(float factor) 
    {
        radius *= factor;
    }

    @Override
    public String getName() 
    {
        return "A circle of radius " + radius;
    }
}
