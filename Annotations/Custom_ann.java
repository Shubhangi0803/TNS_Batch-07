package Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation1 //custom 
{
	String name();
	int id();
}
class test_myAnnotation1{
	@myAnnotation1(name="Shubhangi",id=8)
	public void method1()
	{
		System.out.println("method-1");
	}
	@myAnnotation1(name="Shubha",id=8)
	public void method2()
	{
		System.out.println("method-2");
	}
	public void method3()
	{
		System.out.println("method-3");
	}
	private int a=8;
}
public class Custom_ann {

	public static void main(String[] args) {
		
		test_myAnnotation1 obj=new test_myAnnotation1();
		for(Method m:obj.getClass().getMethods())
		{
			if(m.isAnnotationPresent(myAnnotation1.class))
			{
				Annotation an=m.getAnnotation(myAnnotation1.class);
				myAnnotation1 m1=(myAnnotation1)an;
				System.out.println("Name : "+m1.name());
				System.out.println("Id   : "+m1.id());
			}
		}
		obj.method1();
		obj.method2();
		obj.method3();
		
	}

}
