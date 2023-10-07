package MultiThreading;

class ChildThread1 extends Thread
{
	int a;
	String msg;
	public ChildThread1(int a, String msg) {
		this.a = a;
		this.msg = msg;
	}
	@Override
	public void run() //after calling run method the time slicing is start
	{
		for(int i=0;i<=a;i++)
		{
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e)
			{
				System.out.println("e.getMessage");
			}
			//System.out.println(msg+" " +i);
		}
	}
}
public class ThreadMethod {

	public static void main(String[] args) {
		ChildThread1 ct1=new ChildThread1(5,"First");
		ChildThread1 ct2=new ChildThread1(3,"Second");
		System.out.println("Current Thread : "+Thread.currentThread());
		ct1.start();
		ct2.start();
		Thread.currentThread().setName("PThread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Current Thread: "+Thread.currentThread());
		try{
			ct1.join();
			ct2.join(300);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("End of Main Method");
	}

}
