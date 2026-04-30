
package shapescalculator;


public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length=1;
        this.width=1;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length>=0)
        this.length = length;
        else
        {
            System.out.println("Invalid input length must be greater than zero.");
        }
    }

    public void setWidth(double width) {
        if(width>=0)
        this.width = width;
        else
        {
            System.out.println("Invalid input width must be greater than zero.");
        }
    }
    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return (length+width)*2;
    }
    public boolean isSquare()
    {
        if(length==width)
            return true;
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Rectangle details:\n"+
                "Length="+length+"\n"+
                "Width="+width+"\n"+
                "Area="+getArea()+"\n"+
                "Perimeter="+getPerimeter()+"\n"+
                "Is it a square? "+isSquare()+"\n"+
                "--------------------------";
    }
    
}
