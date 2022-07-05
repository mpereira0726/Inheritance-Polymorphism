public class Circle extends Shape
{
private double radius;

public Circle()
{
    radius = 1;
}

public Circle(double radius)
{
    this.radius = radius;
}

public Circle(double radius, boolean isFilled, String color)
{
    super(isFilled, color);
    this.radius = radius;
}

public double getArea()
{
    return Math.PI * radius * radius;
}

@Override
public String toString()
{
    return "Radius: " + this.radius + "\n" + "Area: " + this.getArea() + "\n" + "Filled: " + this.getFilled() + "\n" + "Color: " + this.getColor();
}

}
