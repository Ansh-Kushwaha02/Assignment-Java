package in.mindcraft;
import java.util.*;
public class Date {
	private int dd,mm,yy;
	public Date() 
	{
		dd = dd;
		mm = mm;
		yy = yy;
	}
	public Date(int dd, int mm, int yy) 
	{
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public void show() 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter day: ");
		dd = sc.nextInt();
        System.out.print("Enter month: ");
        mm = sc.nextInt();
        System.out.print("Enter year: ");
        yy = sc.nextInt();

		System.out.print("Date of Birth: ");
		System.out.println(dd+"/"+mm+"/"+yy);
	}

}
