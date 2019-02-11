import java.util.*;
class traingle
{
 public static void main(String args[])
 {
 Scanner s = new Scanner(System.in);
 System.out.println("SIDE 1");
 int a = s .nextInt();
 System.out.println("SIDE 2");
 int b = s.nextInt();
 System.out.println("SIDE 3");
 int c = s.nextInt();

 if(a==b && b==c)
  System.out.println("EQUILATERAL");
 else if((a==b && b!=c) || (a!=b && c==a) || (c==b && c!=a))
  System.out.println("ISOSCELES");
else if(a*a+b*b==c*c)
  System.out.println("PYTHAGOREAN TRIPLE");
 else if(a!=b && b!=c && c!=a)
  System.out.println("SCALENE"); 
 
 }
}
 
 
