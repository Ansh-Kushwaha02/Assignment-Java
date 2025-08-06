class Vehical
{
	int milage;
	String colour;
	String type;
	
	void display()
	{
		System.out.println("Milage is: "+milage);
		System.out.println("Colour is: "+colour);
		System.out.println("Type is:"+type);
	}
}

class Car extends Vehical
{
	int price;
	String ftype;
	boolean sunroof;
	String model;
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.colour = "Blue";
		c1.milage = 20;
		c1.type = "4 wheeler";
		c1.display();
		c1.price = 150000;
		c1.sunroof= true;
		System.out.println(c1.price);
		System.out.println(c1.sunroof);

	}

}
