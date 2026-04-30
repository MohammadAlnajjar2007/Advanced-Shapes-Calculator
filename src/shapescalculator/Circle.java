
package shapescalculator;


public class Circle {
   private double radius;
   public Circle()
   {
       this.radius=1.0;
   }

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if(radius>=0)
        this.radius = radius;
        else 
        {
            System.out.println("Invalid input radius must be greater than zero.");
        }
      
    }
      public double getArea()
        {
            return Math.PI*Math.pow(radius, 2);
        }
      public double getPerimeter()
      {
          return Math.PI*radius*2;
      }
    public String toString()
    {
        return "Circle details:\n"+
                "Radius="+radius+"\n"+
                "Area="+getArea()+"\n"+
                "Perimeter="+getPerimeter()+"\n"+
                "--------------------------";
    }
   
}
