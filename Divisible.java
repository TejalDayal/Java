class Divisible
 
{
    public static void main(String args[]);
    {
        int a,b;
        System.out.println("Enter the number you want to divide");
        Scanner i=new Scanner(System.in);                
        a=i.nextInt();
        System.out.println("Enter the divisor");   
        b=i.nextInt(); 
        if(a%b==0)
        {
            System.out.println(a+" is multiple of "+b);
        }
        else
       {
           System.out.println(a+" is not a multiple of "+b);
       }
   }
}