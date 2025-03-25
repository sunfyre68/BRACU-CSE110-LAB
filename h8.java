public class h8
{
    public static void main(String[]args)
    {
        double a = 8;
        double b = 3;
        double s = Math.sqrt(Math.pow(a/2,2)+Math.pow(b,2));
        double area = (3 * Math.sqrt(3) * Math.pow(s,2)) / 2;
        double circumference = 6 * s;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}