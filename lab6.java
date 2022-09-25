import  java.util.Scanner;
class oe extends Exception
{
	int a;
	oe(int a) { this.a=a;}
	public String toString()
	{
	return "Overflow inserting " + a;
	}
}

class ue extends Exception
{
	int a;
	ue(int a) { this.a=a;}
	public String toString()
	{
	if(a==1)
		return "Underflow";
	else
		return "Stack Empty";
	}
}
	
class queue
{
	int q[],r,f;
	queue(int s)
	{
	q=new int[s];
	r=0;f=0;
	}
	void insert(int a) throws oe
	{
	if(r==q.length)
		throw new oe(a);
	else
	{
		q[r++]=a;
		System.out.println(a + " pushed into Stack");
		System.out.println("Remaining Stack Capacity : "+(q.length - r ));	
	}
	}
	int delete() throws ue
	{
	if(f==r)
		throw new ue(1);
	else
	{	
		System.out.println("Queue contains " + (r - f) + " elements before Deletion");
		return q[f++];
	}
	}
	void display() throws ue
	{
		int i;
		if(f==r)
			throw new ue(2);
		else
			for(i=f;i<r;i++)
				System.out.print(q[i] + "\t");
	}
}

class lab6
{
	public static void main(String args[])
	{
	
		Scanner in=new Scanner(System.in);
		int i,s,a,ch;
		queue q;
		System.out.println("Enter Queue Size :");
		s=in.nextInt();
		q=new queue(s);	
		do
		{
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Display");	
			System.out.println("4. Exit");
			ch=in.nextInt();
			try
			{
			switch(ch)
			{
			case 1:
				System.out.println("Enter element to insert");
				a=in.nextInt();
				q.insert(a);
				break;
			case 2:
				System.out.println(q.delete() + " deleted ");	
				break;
			case 3:
				q.display();	
				break;
			}
			}catch(oe e) {System.out.println(e);}
			catch(ue e) {System.out.println(e);}
			}while(ch!=4);
	}
}

