//8
/* Assume a Hexagon where each of the sides are of the same length. From the visualization, we can see the values of a and b are given. Your task is to  write a Java code to find the area and the circumference of the Hexagon. */

public class h8b
{
    public static void main(String[]args)
    {
        double a = 8;
        double b = 3;
        double s = Math.sqrt(Math.pow((a/2),2)+Math.pow(b,2));
        double area = (3 * Math.sqrt(3) * Math.pow(s,2))/ 2;
        double circumference = 6 * s;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
