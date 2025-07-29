package in.mindcraft;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int O_Number = num;
		int sum = 0;
		
		while (num !=0) 
		{
			int digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
		}
		
		if(sum == O_Number)
		{
			System.out.println(O_Number+ " " + " is ArmStrong Number");
		}
		else
		{
			System.out.println(O_Number + " " + "is not ArmStrong Number");
		}

	}

}
