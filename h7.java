//7
/* You have been traveling on a bike for 5 hours, 56 minutes, and 23 seconds. Assuming the distance covered is (Last 4 digits of your student ID) meter. Write a Java code to display the velocity of your bike in kilometers per hour and miles per hour. [Hint: 1 mile = 1609 meters]

Test Data:
Input distance in meters: 2500 // Assuming the last 4 digits are 2500

Expected Output:
Your velocity in km/h is 0.4208951
Your velocity in miles/h is 0.2615880 */


public class h7 {
    public static void main(String[] args) {
        double distance = 1544;
        double kms = distance / 1000;
        double miles = distance / 1609;
        double time = (5 + 56 / 60 + 23 / 3600);
        double km_hr = kms / time;
        double miles_hr = miles / time;
        System.out.printf("Your velocity in km/h is %.7f\n", km_hr);
        System.out.printf("Your velocity in miles/h is %.7f\n", miles_hr);
    }
}