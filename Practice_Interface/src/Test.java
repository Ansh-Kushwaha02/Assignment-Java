interface Vehicle
{
	void start();
	void stop();
}
class Car implements Vehicle
{
	public void start()
	{
		System.out.println("car Started");
	}
	public void stop()
	{
		System.out.println("Car Stopped");
	}
}
class Bike implements Vehicle
{
	public void start()
	{
		System.out.println("Bike Started");
	}
	public void stop()
	{
		System.out.println("Bike Stopped");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle c1 = new Car();
		c1.start();
		c1.stop();
		Vehicle b1 = new Bike();
		b1.start();
		b1.stop();

	}

}
