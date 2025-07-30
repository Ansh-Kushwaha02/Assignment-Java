
public class Test {

	public class Main {
	    public static void main(String[] args) {
	        Manager manager = new Manager(101, "Rahul", 60000);
	        System.out.println("Manager Details:");
	        manager.displayData();

	        System.out.println("-------------------------------");

	        MarketingExecutive executive = new MarketingExecutive(10, 102, "Ansh", 50000);
	        System.out.println("Marketing Executive Details:");
	        executive.displayData();
	    }
	}

}
