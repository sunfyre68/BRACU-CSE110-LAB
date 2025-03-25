//01 - Write a Java code where given an integer we need to print the last 2 digits of that number.

public class h1
{
   public static void main(String[]args)
   {
     int number = 1234;
     int lastTwo = number%100;
     System.out.println("The last two digits are:" + lastTwo);
   }
}
