package Annotations;
class Parent
{
	public void parent_display()
	{
		System.out.println("display() of parent class");
	}
}
class Child extends Parent
{
	@Override
	public void parent_display()
	{
		System.out.println("Child Class");
	}
}
class Deprecated_Ex
{
	@Deprecated
	public void method1()
	{
		System.out.println("Deprecated Method");
	}
}
public class BuiltInAnnotations {
	@SuppressWarnings("deprecation")
	public static void show()
	{
		Deprecated_Ex dobj=new Deprecated_Ex();
		dobj.method1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.parent_display();
		show();
	}

}
