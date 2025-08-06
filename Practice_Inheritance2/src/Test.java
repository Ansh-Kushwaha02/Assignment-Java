class Book
{
	String title;
	String author;
	double price;
	
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayDetails()
	{
		System.out.println("Book Title is: "+title);
		System.out.println("Author of the Book is: "+author);
		System.out.println("Price of the Book is: "+price);
	}
}
class PrintBook extends Book
{
	int pagecount;

	public PrintBook(String title, String author, double price, int pagecount) {
		super(title, author, price);
		this.pagecount = pagecount;
	}
	
	void PrintBookDetails()
	{
		System.out.println("Total Page Count: "+pagecount +" Page");
	}
}
class Ebook extends Book
{
	double filesize;

	public Ebook(String title, String author, double price, double filesize) {
		super(title, author, price);
		this.filesize = filesize;
	}
	
	void displayFileSize()
	{
		System.out.println("FileSize: "+filesize+" MB");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Book Details");
		PrintBook p1 = new PrintBook("Atomic Habbit", "Alice",500,200 );
		p1.displayDetails();
		p1.PrintBookDetails();
		
		System.out.println("-------------------------");
		
		System.out.println("Ebook Datails");
		Ebook e1 = new Ebook("Atomic Habit", "John", 250, 25.5);
		e1.displayDetails();
		e1.displayFileSize();

	}

}
