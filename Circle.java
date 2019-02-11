import java.util.*;
public class Circle
{
 static void area()
{
     Scanner s = new Scanner(System.in);
     System.out.println("ENTER THE RADIUS");
     double r = s.nextDouble();
     double area  = ((22*r*r)/7);
     System.out.println("AREA OF CIRCLE IS:" +area);
   }

 static void circumference()
 {
  Scanner s = new Scanner(System.in);
  System.out.println("ENTER CIRCUMFERENCE");
  double c = s.nextDouble();
  double circumference = (2*22*c*c);
  System.out.println("AREA OF CIRCUMFEREMCE IS:" +circumference);
 }
public static void main (String args[])
{
area();
circumference();
}
}
