import java.util.Scanner;

public class HW1_2{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int radius;
        final double pi = 3.14;
            System.out.println("Enter the radius of a circle: ");
            radius = scnr.nextInt();

            System.out.println("The area of the circle is: " + (pi*(radius*radius)));

    }
}