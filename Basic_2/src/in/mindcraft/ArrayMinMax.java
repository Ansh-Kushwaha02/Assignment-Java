package in.mindcraft;
import java.util.*;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.print("Enter 5 number: ");

		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length;i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Max num is: "+max);
		System.out.println("Min Num is: "+min);
		

	}

}
