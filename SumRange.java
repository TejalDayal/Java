import java.util.*;
class SumRange
{
static int o;
static int r;
static int SumRange(int a,int b)
{
o=(int)((Math.random()*b) +a);
r=(int)((Math.random()*b) +a);
System.out.println("First random number is: "+ o);
System.out.println("Second random number is: " + r);
return o+r;
}
public static void main(String str[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter 1st number");
int no1 =s.nextInt();
System.out.println("Enter 2nd Number");
int no2=s.nextInt();
int sum=SumRange(no1,no2);
System.out.println("Sum of random Number is: "+sum);
}
}

