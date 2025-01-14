package mvp;


public class Static {
static int n=0;
	
	
	static void count()
	{
		n++;	
	}
	

	public static void main(String[] args) {
	
	    Static.count();
	    System.out.println("number increment=>"+Static.n);
	    
	    Static.count();
	    System.out.println("number increment=>"+Static.n);

	}

}
