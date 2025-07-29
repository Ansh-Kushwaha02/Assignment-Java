package in.mindcraft;
import java.util.*;

class AccountHolder
{
	private int ac_no;
	private String ac_name;
	private double ac_balance;
	
	public AccountHolder(int ac_no, String ac_name, double ac_balance)
	{
		this.ac_no = ac_no;
		this.ac_name = ac_name;
		this.ac_balance = ac_balance;
		
	}

	public int getAc_no() {
		return ac_no;
	}

	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}

	public String getAc_name() {
		return ac_name;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}

	public double getAc_balance() {
		return ac_balance;
	}

	public void setAc_balance(double ac_balance) {
		ac_balance = ac_balance;
	}
	
	
//	Deposit method
	public void deposit(double amt)
	{
		ac_balance = ac_balance + amt;
	}
	
//	Withdraw method
	public void amount_withdraw(double amt)
	{
		ac_balance = ac_balance - amt;
	}
	
//	details display methods
	
	public void display_details()
	{
		System.out.println(ac_no +"\t" + ac_name + "\t"+ac_balance);
	}
}


public class Test 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0 , choose, Account_no;
		AccountHolder account[] = new AccountHolder[20];
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		    System.out.println("1.Add Account Details");
		    System.out.println("2.Display Account Details");
		    System.out.println("3.Deposit Amount");
		    System.out.println("4.Withdraw Amount");
		    System.out.println("5.Exit");
		    System.out.print("Enter your choice:");
		    choose = sc.nextInt();

		    switch(choose) 
		    {
		        case 1:
		            System.out.println("Enter Account number, Account Holder Name, Account Balance:");
		            account[count++] = new AccountHolder(sc.nextInt(), sc.next(), sc.nextDouble());
		            break;

		        case 2:
		            System.out.println("All Account Details");
		            System.out.println("___________________");
		            for(int i = 0; i < count; i++) 
		            {
		                account[i].display_details();
		            }
		            System.out.println();
		            break;

		        case 3:
		            System.out.println("Enter account no for deposit:");
		            Account_no = sc.nextInt();
		            for(int i = 0; i < count; i++) 
		            {
		                if(Account_no == account[i].getAc_no()) 
		                {
		                    System.out.println("Amount to deposit:");
		                    account[i].deposit(sc.nextDouble());
		                    break;  // break after deposit
		                }
		            }
		            break;

		        case 4:
		            System.out.print("Enter account no to withdraw:");
		            Account_no = sc.nextInt();
		            for(int i = 0; i < count; i++) 
		            {
		                if(Account_no == account[i].getAc_no()) 
		                {
		                    System.out.print("Enter amount to withdraw:");
		                    account[i].amount_withdraw(sc.nextDouble());
		                    break;  // break after withdrawal
		                }
		                else
		                {
		                	System.out.println("Insufficent Balance");
		                }
		            }
		            break;

		        case 5:
		            System.exit(0);
		            break;
		    }
		}

		
	}	
}

