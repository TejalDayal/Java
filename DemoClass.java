class DemoClass
{
	int a,b,c;

	void init()

	{
		a=50;
		b=20;
	}
	int add() {
	c=a+b;
	return c;
	}

public static void main(String args[])
{
	DemoClass ob=new DemoClass();
ob.init();
int ans=ob.add();
System.out.println("Addition ="+ans);
}
}