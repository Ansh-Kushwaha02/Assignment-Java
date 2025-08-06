interface Connectable
{
	public void connectToWiFi(String networkName);
}
interface MediaPlayable
{
	public void playMedia(String mediaName);
}
class SmartPhone implements Connectable,MediaPlayable
{
	String brand;

	public SmartPhone(String brand) {
		this.brand = brand;
	}
	public void connectToWiFi(String networkName)
	{
		System.out.println("SmartPhone"+brand+"Connected to "+networkName);
	}
	public void playMedia(String mediaName)
	{
		System.out.println("SmartPhone"+brand+"Connected to "+mediaName);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connectable c1 = new SmartPhone("Samsung");
		c1.connectToWiFi("Home_wifi");
		MediaPlayable c2 = new SmartPhone("Sumsung");
		c2.playMedia("Chill Beat");
	}
}
