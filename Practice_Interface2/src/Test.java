interface Shape
{
	double getArea();
}
class Circle implements Shape
{
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getArea()
	{
		return 3.14*radius*radius;
	}
}
class Rectangle implements Shape
{
	int l;
	int b;
	
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	public double getArea()
	{
		return l*b;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c1 = new Circle(5);
		System.out.println("Area of Circle is: "+c1.getArea());
		Shape r1 = new Rectangle(10, 5);
		System.out.println("Area of Rectangle is: "+r1.getArea());

	}

}
