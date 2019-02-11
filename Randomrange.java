import java.util.*;
class Randomrange
{
static int o;
static int randomInRange(int a,int b)
{
o=(int)((Math.random()*b) +a);
return o;
}
public static void main(String str[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the 1st number");
int no1=s.nextInt();
System.out.println("Enter the 2nd Number");
int no2=s.nextInt();
int random=randomInRange(no1,no2);
System.out.println("Random Number is: "+random);
}
}
