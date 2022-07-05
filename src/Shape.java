public class Shape {
    private static boolean isFilled;
    private String color;

    public Shape()
    {
        isFilled = true;
        color ="Green";
    }

    public Shape(boolean isFilled, String color)
    {
        this.isFilled = isFilled;
        this.color = color;
    }

    public boolean getFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled)
    {
        isFilled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    @Override
    public String toString()
    {
        return "Filled: " + this.isFilled + "\n" + "Color: " + this.color;
    }
}
