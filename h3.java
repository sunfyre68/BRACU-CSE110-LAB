//3 - Write Java code that calculates and prints the circumference and area of a circle with a radius of 4 units.

public class h3
{
    public static void main(String[]args)
    {
        
        double radius = 4;
        double circumference = 2*Math.PI*radius;
        double area = Math.PI*Math.pow(radius,2);
        
        System.out.println("The circumference is: " + circumference);
        System.out.println("The area is: " + area);
    }
}