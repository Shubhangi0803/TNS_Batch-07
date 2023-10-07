package InterThreadComm;

class book
{
	String title;
	boolean isCompleted;
	public book(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public void setDone(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}
class Writer implements Runnable
{
	book myBook;
	Writer(book b)
	{
		this.myBook=b;
	}
	@Override
	public void run()
	{
		synchronized(myBook)
		{
			System.out.println("Author is writing the book "+myBook.getTitle());
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			myBook.setDone(true);
			System.out.println("Book is Completed");
			System.out.println("Calling all Readers");
			myBook.notifyAll();
		}
	}
}
class Reader implements Runnable
{
	
	book myBook;
	Reader(book b)
	{
		this.myBook=b;
	}
	@Override
	public void run()
	{
		synchronized(myBook){
		System.out.println(Thread.currentThread().getName()+" is waiting for a book");
		
			System.out.println("Author is writing the book "+myBook.getTitle());
			try{
				myBook.wait();
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			
			System.out.println(Thread.currentThread().getName()+" is completed Reading");
	}
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		book myBook=new book("Java Programming");
		Reader obj1=new Reader(myBook);
		Reader obj2=new Reader(myBook);
		Thread t1=new Thread(obj1,"Shubhangi");
		Thread t2=new Thread(obj2,"Mau");
		t1.start();
		t2.start();
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		Writer bookWriter=new Writer(myBook);
		Thread writerthread=new Thread(bookWriter);
		writerthread.start();
	}

}
