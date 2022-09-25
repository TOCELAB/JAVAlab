class outer
{
int a=10;
public int b=20;
private int c=30;
protected int d=40;
	class inner
	{
		 int p=5;
		 public int q=15;
		 private int r=25;
		 protected int s=35;
	 	void diplay()
	 	{
	 		System.out.println("Inner class");
	 		System.out.println("Value of a="+a);
	 		System.out.println("Value of public variable"+b);
	 		System.out.println("Value of private variable"+c);
	 		System.out.println("Value of protected variable"+d);
	 	}
	}
	void outermet()
	{
	 	inner inn=new inner();
	 	inn.diplay();
	 	System.out.println("Outer class");
	 	System.out.println("Value of p="+inn.p);
	 	System.out.println("Value of public variable"+inn.q);
	 	System.out.println("Value of private variable"+inn.r);
	 	System.out.println("Value of protected variable"+inn.s);
	}
}

class pg_1b
{
public static void main(String args[])
{
outer ot=new outer();
ot.outermet();
}
}
