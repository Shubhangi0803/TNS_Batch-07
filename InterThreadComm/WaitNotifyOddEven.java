package InterThreadComm;

class printOddEven{
	boolean flag=false;
	public synchronized void printOddNo(int no)throws InterruptedException{
		while(flag)
		{
			wait();
		}
		flag=true;
		Thread.currentThread().setName("Print Odd  Number ");
		System.out.println("Thread Name : "+Thread.currentThread().getName()+" - "+no);
		notify();
	}
	public synchronized void printEvenNo(int no)throws InterruptedException
	{
		while(!flag)
		{
			wait();
		}
		flag=false;
		Thread.currentThread().setName("Print Even Number ");
		System.out.println("Thread Name : "+Thread.currentThread().getName()+" - "+no);
		notify();
	}
}
class OddNo extends Thread
{
	printOddEven obj;
	int no;
	public OddNo(int no,printOddEven oddevenObj)
	{
		this.no=no;
		this.obj=oddevenObj;
	}
	public void run()
	{
		int num=1;
		try{
			while(num<=no)
			{
				obj.printOddNo(num);
				num=num+2;
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
			
		}
	}
}
class EvenNo extends Thread
{
	printOddEven obj;
	int no;
	public EvenNo(int no,printOddEven oddevenObj)
	{
		this.no=no;
		this.obj=oddevenObj;
	}
	public void run()
	{
		int num=2;
		try{
			while(num<=no)
			{
				obj.printEvenNo(num);
				num=num+2;
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
			
		}
	}
}
public class WaitNotifyOddEven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOddEven obj1=new printOddEven();
		EvenNo eObj=new EvenNo(10,obj1);
		OddNo oObj=new OddNo(10,obj1);
		eObj.start();
		oObj.start();

	}

}
