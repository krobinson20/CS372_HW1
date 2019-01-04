import java.util.Scanner;

public class HW1_3{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String userinput;

        System.out.println("Enter a number: ");
        userinput = scnr.nextLine();
        byte [] usersstring= userinput.getBytes(); 
        
        
      
       if(usersstring[0] < 48 || usersstring[0] > 57)
       {
         System.out.println("You did not enter a number, please try again: ");
                userinput = scnr.nextLine();
                char c = userinput.charAt(0);
                int ascii = (int)c;
       }
        int returnedint = 0;
        int factor = 1;
       for(int i = userinput.length()-1; i >=0;i--)
       {
           returnedint += (userinput.charAt(i) - '0') * factor;
           factor*=10;
       }
System.out.println("The converted string is: " + returnedint);
    }
}