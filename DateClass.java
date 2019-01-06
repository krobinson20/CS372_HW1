public class DateClass{

private int day;
private int month;
private int year;

    //PT -- constreuctors don't have return types. -3
void DateClass()
{
    day=1;
    month=12;
    year = 2018;
}

void DateClass(int a,int b, int c)
{
    year = c;
    if(b < 1 && b < 13)
    {
        month = b;
    }
    else
    {
        //PT -- don't put output or input in a constructor. Just fail. -1
        while(b < 0 || b > 13) {
         System.out.println("That is not a valid month, please enter a new value: ");
        month = scnr.nextInt();
        }
    }
    if(a < 1 && a > 31)
    {
        if(b == 2 && a == 31)
        {
            while(a >= 31) 
            {
            System.out.println("That is not a valid day, please enter a new value: ");
            month = scnr.nextInt();
            }
        }
        day = a;
    }
}
int Getday()
{
return day;
}
int Getmonth()
{
    return month;
}
int Getyear()
{
    return year;
}
void Setday(int a)
{
    //PT -- need to be smart here. -2
 day = a;
}
void Setmonth(int a)
{
    month = a;
}
void Setyear(int a)
{
    year = a;
}

void TodaysDate()
{
    System.out.println("Today's date is " + month + "/" + day + "/" + year);
}

void DaysinFuture(DateClass a, DateClass b)
{
    //PT -- be more efficient here. -1
    if(a.Getyear() == b.Getyear())
    {
        if(a.getmonth() == b.Getmonth())
        {
            if(a.Getday() == b.Getday())
            {
                System.out.println("The difference in days is: 0");
            }

            else if(a.Getday() > b.Getday())
            {
                System.out.println("The difference in days is: " + (a.Getday() - b.Getday()));
            }
        }

        else if(a.Getmonth() > b.Getmonth())
        {
            int diffinmonths = a.Getmonth() - b.Getmonth();
            
            if(a.Getday() > b.Getday())
            {
                int diffindays = a.Getday() - b.Getday();
                diffindays = diffindays + (diffinmonths*30);
                System.out.println("The difference in days is: " + diffindays);
            }
            if(b.Getday() > a.Getday())
            {
                int diffindays = b.Getday() - a.Getday();
                diffindays = diffindays + (diffinmonths*30);
                System.out.println("The difference in days is: "  + diffindays);
            }
        }
        else if(a.getmonth() < b.Getmonth())
        {
            int diffinmonths = b.Getmonth() - a. Getmonth();
            
            if(a.Getday() > b.Getday())
            {
                int diffindays = a.Getday() - b.Getday();
                diffindays = diffindays + (diffinmonths*30);
                System.out.println("The difference in days is: "  + diffindays);
            }
            if(b.Getday() > a.Getday())
            {
                int diffindays = b.Getday() - a.Getday();
                diffindays = diffindays + (diffinmonths*30);
                System.out.println("The difference in days is: "  + diffindays);
            }
        }
    }
    else if(a.Getyear() > b.Getyear())
    {
        int diffinyears = a.Getyear() - b.Getyear();
        
        if(a.getmonth() == b.Getmonth())
        {
            if(a.Getday() == b.Getday())
            {
                System.out.println("The difference in days is: " + (diffinyears * 365));
            }

            else if(a.Getday() > b.Getday())
            {
                System.out.println("The difference in days is: " + (a.Getday() - b.Getday() + (diffinyears *365)));
            }
        }

        else if(a.Getmonth() > b.Getmonth())
        {
            int diffinmonths = a.Getmonth() - b.Getmonth();
            
            if(a.Getday() > b.Getday())
            {
                int diffindays = a.Getday() - b.Getday();
                diffindays = diffindays + (diffinmonths*30)+ (diffinyears * 365);
                System.out.println("The difference in days is: "  +diffindays);
            }
            if(b.Getday() > a.Getday())
            {
                int diffindays = b.Getday() - a.Getday();
                diffindays = diffindays + (diffinmonths*30) +  (diffinyears * 365);
                System.out.println("The difference in days is: "  + diffindays);
            }
        }
        else if(a.getmonth() < b.Getmonth())
        {
            int diffinmonths = b.Getmonth() - a. Getmonth();
            
            if(a.Getday() > b.Getday())
            {
                int diffindays = a.Getday() - b.Getday();
                diffindays = diffindays + (diffinmonths*30) +  (diffinyears * 365);
                System.out.println("The difference in days is: "  + diffindays);
            }
            if(b.Getday() > a.Getday())
            {
                int diffindays = b.Getday() - a.Getday();
                diffindays = diffindays + (diffinmonths*30);
                System.out.println("The difference in days is: "  + diffindays);
            }
        }
    }
else if(b.Getyear() > a.Getyear())
    {
        int diffinyears = b.Getyear() - a.Getyear();
        
        if(a.getmonth() == b.Getmonth())
        {
            if(a.Getday() == b.Getday())
            {
                System.out.println("The difference in days is: " + (diffinyears * 365));
            }

            else if(a.Getday() > b.Getday())
            {
                System.out.println("The difference in days is: " + (a.Getday() - b.Getday() + (diffinyears *365)));
            }
        }

        else if(a.Getmonth() > b.Getmonth())
        {
            int diffinmonths = a.Getmonth() - b.Getmonth();
            
            if(a.Getday() > b.Getday())
            {
                int diffindays = a.Getday() - b.Getday();
                diffindays = diffindays + (diffinmonths*30)+ (diffinyears * 365);
                System.out.println("The difference in days is: "  +diffindays);
            }
            if(b.Getday() > a.Getday())
            {
                int diffindays = b.Getday() - a.Getday();
                diffindays = diffindays + (diffinmonths*30) +  (diffinyears * 365);
                System.out.println("The difference in days is: "  + diffindays);
            }
        }
        else if(a.getmonth() < b.Getmonth())
        {
            int diffinmonths = b.Getmonth() - a. Getmonth();
            
            if(a.Getday() > b.Getday())
            {
                int diffindays = a.Getday() - b.Getday();
                diffindays = diffindays + (diffinmonths*30) +  (diffinyears * 365);
                System.out.println("The difference in days is: "  + diffindays);
            }
            if(b.Getday() > a.Getday())
            {
                int diffindays = b.Getday() - a.Getday();
                diffindays = diffindays + (diffinmonths*30);
                System.out.println("The difference in days is: "  + diffindays);
            }
        }
    }
}

public void creatdateinfuture(DateClass a, int n)
{
 if(n>31)
 {
     int remainder = n%31;
     
 }  

 if(a.Getday+n>=31 && a.Getmonth!= 2)
 {
    int remainder = a.Getday() + n;
    DateClass newDate = new DateClass(remainder, a.Getmonth(), a.Getyear());
 }

}
