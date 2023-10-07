package MultiThreading;

public class Start_Run extends Thread
{
	
	@Override
	public void run() {
		//using built-in function for giving name to thread
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		
	}

	public static void main(String[] args) 
	{
		Start_Run s1=new Start_Run();
		s1.start(); 
		//s1.run(); //
	}

}
