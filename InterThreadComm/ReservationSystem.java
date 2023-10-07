package InterThreadComm;

class reservation extends Thread
{
	int noOfSeats=2;
	int needsSeat;
	
	public reservation(int noSeat) 
	{
		this.needsSeat = noSeat;
	}
	public void run()
	{
		System.out.println("Printing run()");
		booking();
	}
	public void booking()
	{
		String Threadname=Thread.currentThread().getName();
		System.out.println("No.of Seats available : "+ noOfSeats);
		synchronized(this){
		if(noOfSeats>needsSeat)
		{
			System.out.println("Booking my seats " +needsSeat+ " For "+Threadname);
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
				noOfSeats=noOfSeats-needsSeat;
				System.out.println("Seats Booked For " +Threadname);
				System.out.println("No of Seats available "+noOfSeats);
			
		}
		else{
			System.out.println("No Seats available");
		}
	}
	}
	
}
public class ReservationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reservation obj=new reservation(1);
		
		Thread cust1=new Thread(obj);
		Thread cust2=new Thread(obj);
		Thread cust3=new Thread(obj);
		cust1.setName("Cust -1");
		cust2.setName("Cust -2");
		cust3.setName("Cust -3");
		cust1.start();
		cust2.start();
		cust3.start();

	}

}
