
class Polygon{
}
class Circle extends Polygon
{
	private double radius;
//	Default Constructor
	public Circle()
	{
		radius = 1;
	}
//	Parametrized Constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	public double calArea()
	{
		return 3.14*radius*radius;
	}
	public double calPari()
	{
		return 2*3.14*radius;
	}
}

//Creating a Rectangle Class and it's extends polygon class  
class Rectangle extends Polygon
{
	private int l,b;
	public Rectangle()
	{
		l=b=1;
	}
	public Rectangle(int l, int b) 
	{
		this.l = l;
		this.b = b;
	}
	public double calArea()
	{
		return l*b;
	}
	public double calPari()
	{
		return 2*(l*b);
	}
	
}
//Creating a Square class that is extending Rectangle class
class Square extends Rectangle
{
	public Square()
	{
		super();
	}

	public Square(int l) {
		super(l,l);
	}
	public double calArea()
	{
		return super.calArea();
	}
	public double calperi()
	{
		return super.calPari();
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println("Circle Method Called");
		System.out.println(c1.calArea());
		System.out.println(c1.calPari());
		
		Square s1 = new Square(4);
		System.out.println("Square Method Called");
		System.out.println(s1.calArea());
		System.out.println(s1.calPari());

	}

}
