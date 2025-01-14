package mvp;


interface Sat
{
	void add();
}
interface Mat {
	void sub();
}
class Bat implements Sat,Mat{
	
	public void add()
	{
		System.out.println("Adding Something");
	}
	public void sub()
	{
		System.out.println("sub Something");
	}
	
}


public class MultipleInheritance {

	public static void main(String[] args) {
		Bat b=new Bat();
		b.add();
		b.sub();

	}

}
