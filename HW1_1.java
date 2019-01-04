import java.util.Scanner;

public class HW1_1 {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int userinput;

        System.out.println("Enter a number between 10 and 100");
        userinput=scnr.nextInt();

        while(userinput <10 || userinput >100)
        {
            System.out.println("That number is out of the range, please enter a new number: ");
            userinput = scnr.nextInt();
        }

        for(int i =1; i <= userinput; i++)
        {
            if(i%2==1)
            {
            System.out.println( i + " is  odd");
            }
            else
            {
            System.out.println(i + " is even");
            }
        }
    }
}