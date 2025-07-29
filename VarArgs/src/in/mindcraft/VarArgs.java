package in.mindcraft;

public class VarArgs {
	public static int add(int ...a) 
	{
		int sum = 0;
		for (int i = 0;i<a.length;i++)
			sum = sum+a[i];
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(20,45,31));
		System.out.println(add(90,30));

	}

}
