import java.util.*;
public class Perimeter12F{
int s1, s2, s3;
double perimeter;
Scanner s=new Scanner (System.in);
void triangle()
{
System.out.println("Enter 1st side : ");
s1=s.nextInt();
System.out.println("Enter 2nd side : ");
s2=s.nextInt();
System.out.println("Enter 3rd side : ");
s3=s.nextInt();
perimeter = s1+s2+s3;
System.out.println("Perimeter of triangle : "+perimeter);
}
public static void main(String args[])
{
Perimeter12F obj=new Perimeter12F();
obj.triangle();
}
}

