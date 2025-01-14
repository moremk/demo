package mvp;


class T 
{
	String name="Mahesh";
	
	void Name() {
		
		System.out.println("Name=>"+name);
	}
	
	T()
	{
		System.out.println("Try to Success T");
	}
	
}
class Y extends T
{
	String std="MCS";
	
	Y()
	{
		super();
		System.out.println("Try to Success Y");
	}

    void Name()
    {
	super.Name();
	System.out.println("std=>"+std);
     }
}

public class Super {
	

	public static void main(String[] args) {
       Y y=new Y();
       y.Name();

	}

}
