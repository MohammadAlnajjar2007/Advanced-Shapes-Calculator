
package shapescalculator;


public class Cuboid {
    private double height;
    private double width;
    private double length;

    public Cuboid() {
    }

    public Cuboid(double height, double width, double length) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        if(height>=0)
        this.height = height;
        else 
            System.out.println("Invalid input height must be greater than zero.");
    }

    public void setWidth(double width) {
                if(width>=0)

        this.width = width;
                else
                    System.out.println("Invalid input width must be greater than zero.");
    }

    public void setLength(double length) {
        if(length>=0)
        this.length = length;
        else
        {
            System.out.println("Invalid input length must be greater than zero.");
        }
    }
    public double getArea()
    {
        return ((length*width)+(length*height)+(height*width))*2;
    }
    public double getPerimeter()
    {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Cuboid details:\n"+
                "length="+length+"\n"+
                "width="+width+"\n"
                + "height="+height+"\n"+
                "Area="+getArea()+"\n"+
                "Perimeter="+getPerimeter()+"\n"
                +"--------------------------";
                
                
        
    }
    
}
