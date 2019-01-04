public class EmployeeClass{

private int EmployeeID;
private String Name;
private String HireDate;
private String CurrentPossition;
private String ReportsTo;

void EmployeeClass()
{
    EmployeeID=1;
    Name = "John Doe";
    HireDate="12/1/18";
    CurrentPossition = "Janitor";
    ReportsTo = "Steve";
}

void EmployeeClass(int a, String b, String c, String d, String e)
{
    EmployeeID=a;
    Name = b;
    HireDate=c;
    CurrentPossition = d;
    ReportsTo = e;
}
 public int getEmployeeID()
{
 return EmployeeID;
}
public String getName()
{
    return Name;
}
public String getHireDate()
{
    return HireDate;
}
public String getCurrentPosition()
{
    return CurrentPossition;
}
public String getReportsTo()
{
    return ReportsTo;
}

public void setName(String n)
{
    Name = n;
}
public void SetId(int n)
{
    EmployeeID = n;
}
public void setHireDate(String n)
{
    HireDate = n;
}
public void setPosition(String n)
{
    CurrentPossition = n;
}
public void setSupervisor(String n)
{
    ReportsTo = n;
}

}