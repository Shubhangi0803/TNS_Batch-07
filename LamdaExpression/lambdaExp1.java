package LamdaExpression;
interface myInterface{
	public void show(String name);
}
public class lambdaExp1 {

	public static void main(String[] args) {
		//implementing anonymously
		myInterface inter=new myInterface() {
			
			@Override
			public void show(String name) {
				System.out.println("Welcome " +name +" to Anonyms class");// TODO Auto-generated method stub
				
			}
		};
		inter.show("Shubhangi");
		System.out.println("--------------------------------");
		//By using lambda
		myInterface m1=(name)->{
		System.out.println("Welcome " +name +" to Anonyms class");
		};
		m1.show("Mau");
	}
	
	

}
