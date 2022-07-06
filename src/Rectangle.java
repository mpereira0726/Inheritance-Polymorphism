public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle()
    {
        length = 2;
        width = 1;
        setLW(1,2);
    }

    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
        setLW(width,length);
    }

    public Rectangle (double width, double length, boolean isFilled, String color)
    {
        super(isFilled, color);
        this.length = length;
        this.width = width;
        setLW(width, length);
    }

    void setLW(double x, double y)
    {
        if(x>y) {
            this.length = x;
            this.width = y;
        }
        else
        {
            this.length = y;
            this.width = x;
        }
    }

    public double getArea()
    {
        return this.length * this.width;
    }

    public String toString()
    {
        return "Width: " + this.width + "\n" + "Length: " + this.length + "\n" + "Area: " + this.getArea() + "\n" + "Filled: " + super.getFilled() +"\n" + "Color: " + super.getColor();
    }


}
