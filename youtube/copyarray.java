package youtube;

public class copyarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int[] b=new int[5];
		b=a;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Second Array element=>"+b[i]);
		}

	}

	
	
}
