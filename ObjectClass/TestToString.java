package ObjectClass;
class person
{
	int pid;
	String Name,add;
	public String name;
	
	public person() {
	}

	public person(int pid, String name, String add) {
		super();
		this.pid = pid;
		Name = name;
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "person [pid=" + pid + ", Name=" + Name + ", add=" + add + "]";
	}
	public boolean equals(Object obj)
	{
		if(obj==this)		return true;
		if(obj==null) return false;
		if(getClass()!=obj.getClass())  return false;
		person other=(person)obj;
		if(name==null){
			if(other.name!=null)
				return false;
		}
		else if(!name.equals(other.name))
				return false;
		if(pid==0)
			if(other.pid!=0)
				return false;
		else if(pid!=other.pid)
			return false;
		return true;
	}
}
public class TestToString {
	public static void main(String[] args) {
		person p1=new person(1,"Shubhangi","Nashik");
		person p2=new person(1,"Vaishnavi","Pune");
		System.out.println(p1.name);
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println(p2);
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));//use for comparing objects
	}

}


