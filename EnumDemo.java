import java.util.Scanner;
enum week
{
SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
boolean WorkDay()
{
if(ordinal() == 0||ordinal() == 6)
return false;
else
return true;
}
};
class EnumDemo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
week day;
System.out.println("Enter the Day:");
String d=s.next();
day=week.valueOf(d);
System.out.println("Is the workday? ANS:"+day.WorkDay());
}
}

