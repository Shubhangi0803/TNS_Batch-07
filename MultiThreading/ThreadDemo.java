package MultiThreading;
class ChildThread extends Thread
{
	int a;
	String msg;
	public ChildThread(int a, String msg) {
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
			System.out.println(msg+" " +i);
		}
	}
}



public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread ct1=new ChildThread(10,"First Thread");
		ChildThread ct2=new ChildThread(20,"Second Thread");
		ct1.start(); // run method implicitly calls start method
		ct2.start();
	}

}
