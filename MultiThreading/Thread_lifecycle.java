package MultiThreading;

public class Thread_lifecycle extends Thread
{
	

	@Override
	public void run() {
		//thread is alive or not?
		System.out.println("Thread Run Method - is alive?"+this.isAlive());
		int num=0;
		while(num<4)
		{
			num++;
			System.out.println("num = "+num);
			
			try
			{
				sleep(500);
				System.out.println("Not Runnable Stage : "+this.isAlive());
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted...");
			}
		}
	}

	public static void main(String[] args) {
		Thread T1=new Thread_lifecycle();
		System.out.println("Before Runnable :"+T1.isAlive());
		T1.start();
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread is interrupted");
		}
		System.out.println("After Completion: "+T1.isAlive());

	}

}
