public class Rectangle {
    private double width;
    private double length;

    public Rectangle()
    {
        length = 2;
        width = 1;
    }

    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle (double width, double length, boolean isFilled, String color)
    {
        this.length = length;
        this.width = width;
        super(isFilled, color);
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


}
