import java.util.*;
class countuppercase
{
static int count=0;
static int countCapital(String a)
{
int l = a.length();
for(int i=0; i<1; i++)
{
if(Character.isUpperCase(a.charAt(i)))
count++;
}
return count;
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter String");
String x = in.next();
int count=countCapital(x);
System.out.println("Upper case Count is: "+ count);
}
}
