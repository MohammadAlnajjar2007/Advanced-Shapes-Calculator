
package shapescalculator;


public class Square {
    private double side;

    public Square() {
        this.side=1;
    }

    public Square(double side) {
               setSide(side);
       
        
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side>=0)
        this.side = side;
        else
        {
            System.out.println("Invalid input side must be greater than zero.");
        }
    }
    public double getArea()
    {
        return side*side;
    }
    public double getPerimeter()
    {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square details:\n"+
                "Side="+side+"\n"+
                "Area="+getArea()+"\n"+
                "Perimeter="+getPerimeter()+"\n"+
                "--------------------------";
    }
    
}
