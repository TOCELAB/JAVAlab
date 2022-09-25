import java.io.*;
class lab2
{
public static void main(String args[])	
	{
	Console in = System.console();
	StringBuffer sb=new StringBuffer("Test");
	System.out.println("Capacity  of StringBuffer object " + sb.capacity());
	System.out.println("Enter name to reverse");
	String s=in.readLine();
	String r=new String();
	for(int i=s.length()-1;i>=0;i--)
	r+=s.charAt(i);
	System.out.println("Reverse of " + s + " is " + r);
	r=r.toUpperCase();
	System.out.println("Its Uppercase " + r);
	System.out.println("Enter String to Append");		
	String a=in.readLine();
	System.out.println("Appending String " + a  +  "  with " + r + " is " + r.concat(a));
	 sb=new StringBuffer(s);
	System.out.println("Append using StringBuffer "+sb.append(a));
	System.out.println("Reverse using StringBuffer "+ sb.reverse());
	}
}
