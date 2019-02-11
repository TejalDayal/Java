class Expdemo
{
public static void main(String args[])
{
 int a=10,b=0;
 try
 { int ar[]=new int[10];
 ar[1]=20;
 int c=a/b;
 }

 catch(ArithmeticException ae)
 {
   System.out.println("Arithmetic Exception");
 }

 catch(IndexOutOfBoundsException Be)
 {
   System.out.println("Index out of Bound");
 }
 catch(Exception e)
 {
   System.out.println("Exception");
 }


}
}
