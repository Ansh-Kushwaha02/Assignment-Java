import java.util.*;

class Atm
{
	private int pin;
	private double balance;
	
	public void pin(int pin) // This is Perametrized Constructor
	{
		System.out.println("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if(enteredpin == pin)
		{
			menu();
		}
		else
		{
			 System.out.println("You have entered wrong pin");
		}
	}
	
	public void menu()
	{
		System.out.println("Enter your Choice: ");
		System.out.println("1. Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt == 1)
		{
			checkbalance();
		}
		else if(opt == 2)
		{
			deposit();
		}
		else if(opt == 3)
		{
			withdraw();
		}
		else if(opt == 4)
		{
			return;
		}
		else
		{
			System.out.println("You Have entered Wrong Option");
			menu();
		}
	}
	
	public void checkbalance()
	{
		System.out.println("Balance is: " + balance);
		menu();
	}
	
	public void deposit()
	{
		System.out.print("Enter amount to Deposit: ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		balance+=amount;
		System.out.println("Money Deposited: "+ "Balance is: "+balance);
		menu();
	}
	
	public void withdraw()
	{
		System.out.print("Enter amount to Withdraw: ");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		if(amount>balance)
		{
			System.out.println("Insufficent Balance");
			menu();
		}
		else
		{
			balance -=amount;
			System.out.println("Withdraw Successfully "+" Balance is: " + balance);
			menu();
		}
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a1 = new Atm();
		a1.pin(1234);

	}

}
