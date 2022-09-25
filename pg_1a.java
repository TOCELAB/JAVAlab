class cube
{
  	double l,b,h;
  	cube()
  	{
    		System.out.println("Constructor with no arguments\n");
   		 l=0;
   		 b=0;
   		 h=0;
  	}
  	cube(double i)
  	{
   		 System.out.println("Constructor with one arguments\n");
   		 l=b=h=i;
  	}
  	cube(double x,double y,double z)
  	{
   		 System.out.println("Constructor with three arguments\n");
   		 l=x;
   		 b=y;
   		 h=z;
  	}
  	void area()
  	{
  		 System.out.println("Method with no arguments");
   		double a=l*b*h;
   		System.out.println("Area of Cube is "+a+"\n");
  	}
  	void area(double t)
  	{
  		  System.out.println("Method with one arguments");
   		 double a=t*t*t;
   		 System.out.println("Area of Cube is "+a+"\n");
  	}

 void area(double p,double q,double r)
 	{
  		System.out.println("Method with three arguments");
 		 double a=p*q*r;
 		 System.out.println("Area of Cube is "+a+"\n");
}
}
 class pg_1a
 {
 	 public static void main(String args[])
  	{
  		 cube A=new cube(5,6,7);
   		 A.area();
   		cube B=new cube(5);
   		B.area();
   		cube C=new cube();
   		C.area();
   		C.area(6);
   		C.area(6,7,8);
 	 }
 }

