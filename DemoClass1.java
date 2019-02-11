import java.util.Scanner;
class DemoClass1
{
	int a,b,c;
void takeinput()

{
	Scanner sm=new Scanner(System.in);
System.out.println("input 1st number");

a=sm.nextInt();


	Scanner smm=new Scanner(System.in);
System.out.println("input 2nd number");

b=smm.nextInt();

c=a+b;

System.out.println(c);

}
public static void main(String args[])
{
	DemoClass1 d=new DemoClass1();
d.takeinput();


}
}
