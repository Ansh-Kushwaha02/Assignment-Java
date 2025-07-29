abstract class Vehical
{
	String type;
	String colour;
	int max_speed;
	

public Vehical(String type, String colour, int max_speed) {
		super();
		this.type = type;
		this.colour = colour;
		this.max_speed = max_speed;
	}
	
	abstract void move();
	
	void display()
	{
		System.out.println("Vehical Type: "+type);
		System.out.println("Vehical Colour is: "+colour);
		System.out.println("Vehical Max Speed is: "+max_speed);
	}
}
class Car extends Vehical
{
	public Car(String type,String Colour, int max_speed)
	{
		super(type,Colour,max_speed);
	}
	void move()
	{
		System.out.println("Car is moving");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Jeep","black",200);
		c1.move();
		c1.display();

	}

}
