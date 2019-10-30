import java.util.*;
abstract class Shape
{
  static int l,b;
  abstract void print_area();
  public static void main(String[] args)
  {
	System.out.println("Enter the parameters");
	Scanner inp=new Scanner(System.in);
	l=inp.nextInt();
	Scanner sc=new Scanner(System.in);
	b=sc.nextInt();

	Rectangle a=new Rectangle();
	a.print_area();
 
	Triangle d=new Triangle();
	d.print_area();
	 
	Circle c=new Circle();
	c.print_area();
	
   }
}
class Rectangle extends Shape
{
   void print_area()
   {
	double area;
	area=l*b;
	System.out.println("Area of the rectangle is "+area);
	 
	}
}
class Triangle extends Shape
{
   void print_area()
   { 
	  double area;
	  area=0.5*l*b;
	  System.out.println("Area of the triangle is "+area);
	}
}
class Circle extends Shape
{
   void print_area()
   {
      double area;
      area=3.14*l*l;
	  System.out.println("Area of the circle is "+area+"(considering first parameter as radius)");
	}
}
