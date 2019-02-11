class Unique
{
static int uniqueNumber(int[] a)
{
int count = 0;
for(int k=0; k<a.length; k++)
{
int i;
for(i=0; i<k; i++)
if(a[k]==a[i])
break;
if(k==i)
{
count++;
}
}
return count;
}
public static void main(String args[])
{
Scanner in = new Scanner (System.in);
System.out.println("Enter the size of array");
int size = in.nextInt();
int[] a = new int[size];
System.out.println(" Enter the array elements ");
for(int i=0; i<size; i++)
{
a[i]=in.nextInt();
}
int cnt = uniqueNumber(a);
System.out.println("Unique number in array : " +cnt);
}
}