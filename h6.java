//6
// Write the Java code of a program that finds the sum of the first 100 positive numbers. You can verify your answer by calculating this sum manually.
//[Do NOT use loops, use the mathematical formula for calculating sum of arithmetic series given below].
//
//Note:
//S = n⁄2 (a + L), where n is the number of terms, a is the first term and L is the last term.

public class h6
{
    public static void main(String[]args)
    {
        int n = 100;
        int a = 1;
        int L = 100;
        int sum = (n*(a+L))/2;
        System.out.println("The sum of the first 100 positive numbers: "+ sum);
    }
}