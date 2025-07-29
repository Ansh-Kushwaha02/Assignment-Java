package in.mindcraft;

public class Date {
		private int dd,mm,yy;
		public Date() 
		{
			dd = 11;
			mm = 02;
			yy = 2000;
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
			System.out.print("Date: ");
			System.out.println(dd+"/"+mm+"/"+yy);
		}

}
