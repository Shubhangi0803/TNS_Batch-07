package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation //custom 
{
	String name();
	int id();
}
class test_myAnnotation{
	@myAnnotation(name="Shubhangi",id=8)
	public void method1()
	{
		System.out.println("method-1");
	}
	@myAnnotation(name="Shubha",id=8)
	public void method2()
	{
		System.out.println("method-2");
	}
}
public class Custom_Annotation {

	public static void main(String[] args) {
		
		try
		{
			Method m=test_myAnnotation.class.getMethod("method2");

			
			myAnnotation ma=(myAnnotation)m.getAnnotation(myAnnotation.class);
			if(ma!=null)
			{
				System.out.println("Name : "+ma.name());
				System.out.println("Id   : "+ma.id());
			}
			else
				System.out.println("No Annotation Found");
			
		}
		catch(NoSuchMethodException e){
			System.out.println(e.getMessage());
		}
		
	}

}
