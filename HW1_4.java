import java.util.Scanner;

public class HW1_4{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        Double height;
        Double weight;
      
            System.out.println("Enter Your height in inches: ");
            height = scnr.nextDouble();
            System.out.println("Enter your weight in pounds: ");
            weight = scnr.nextDouble();
            
            height = height/39.37;
            weight = weight/2.205;
            System.out.println("Your BMI is: " + (weight/(height*height)));
    }
}