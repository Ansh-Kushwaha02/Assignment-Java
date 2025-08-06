class car
{
	public void fullSpeed()
	{
		System.out.println("This call can run at it full speed");
	}
	public void speed(int max_Speed)
	{
		System.out.println("Max Speed: "+max_Speed);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car();
		c1.fullSpeed();
		c1.speed(200);

	}

}
