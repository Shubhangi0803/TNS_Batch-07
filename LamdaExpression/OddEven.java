package LamdaExpression;
interface oe
{
	public void check(int num);
}
interface isodd{
	public boolean isodd(int no);
}
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oe o1=(num)->{
			if(num%2==0){
				System.out.println(num+ " Is Even Num");
			}
			else{
				System.out.println(num+ " Is Odd Num");
			}
		};
		o1.check(35);
		isodd o2=(a)->a%2!=0?true:false;
		System.out.println("6 is "+o2.isodd(6));

	}

}
