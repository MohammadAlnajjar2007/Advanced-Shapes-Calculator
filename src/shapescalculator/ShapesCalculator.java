
package shapescalculator;
import java.util.Scanner;

public class ShapesCalculator {

    
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int choice=0;
        System.out.println("--------------------------");
        System.out.println("Welcome to Shapes Calculator");
        System.out.println("--------------------------");
        while(choice!=4)
        {
            System.out.println("Choose a shape:");
            System.out.println("1.Rictangle");
            System.out.println("2.Circle");
            System.out.println("3.Square");
            System.out.println("4.Exit");
            System.out.println("Enter your choice (1-4):");
             choice=cin.nextInt();
             if(choice==1)
             {
                 System.out.println("Enter the length of the rictangle:");
                 double length=cin.nextDouble();
                 System.out.println("Enter the width of the rictangle:");
                 double width=cin.nextDouble();
                 Rectangle R1=new Rectangle();
                 R1.setLength(length);
                 R1.setWidth(width);
                 System.out.println(R1);
             }
             else if(choice==2)
             {
                 System.out.println("Enter the radius of the circle:");
                 double radius=cin.nextDouble();
                 Circle C1=new Circle();
                 C1.setRadius(radius);
                 System.out.println(C1);
             }
             else if(choice==3)
             {
                 System.out.println("Enter the side of the square:");
                 double side=cin.nextDouble();
                 Square S1=new Square();
                 S1.setSide(side);
                 System.out.println(S1);
             }
             else if(choice==4)
             {
                 System.out.println("Thank you for using the Shapes Calculator (:");
             }
             else 
             {
                 System.out.println("Invalid choice! Please enter a number between 1 and 4.");
             }
        }
    }
    
}
