//02 - Write a Java program that given a number in inches (you have to declare and initialize it yourself) converts it to meters. Note: One inch is 0.0254 meters.

public class h2
{
    public static void main(String[] args) 
    {
        int inches = 1000;

        double convFactor = 0.0254;

        double meters = inches * convFactor;

        System.out.printf("%d inches is %.1f meters", inches, meters);
    }
}




