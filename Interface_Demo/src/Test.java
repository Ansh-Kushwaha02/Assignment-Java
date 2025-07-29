 /* 12. Declare an interface printable as given below. 
interface printable 
{ 
public void printDetails(); 
} 
Write a class CktPlayer with members - name and runs 
Write a class FtPlayer with members - name and goals 
CktPlayer and FtPlayer implements printable interface and overrides its method to  
display details.*/

interface printable
{
	public void printDetails(); 
		
	
}
class CktPlayer implements printable
{
	String name;
	int runs;
	
	public CktPlayer(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Player: "+name +" "+"Runs: "+runs);
	}
}
 
//Goles
class FtPlayer implements printable
{
	String name;
	int goles;
	
	public FtPlayer(String name, int goles) {
		super();
		this.name = name;
		this.goles = goles;
	}
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Football Player: "+name+ " "+"Goles: "+goles);
	}
}



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CktPlayer cktPlayer = new CktPlayer("Dhoni", 100);
		FtPlayer ftPlayer = new FtPlayer("Sunil", 5);
		cktPlayer.printDetails();
		ftPlayer.printDetails();

	}

}
