package string;
import java.util.*;
public class InputOutsideMainmethod {
 static int r;
	static {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a radius=>");
		 r=sc.nextInt();
		
	}

	public static void main(String[] args) {
	
	
		
		int area=(int) 3.14*r*r;          //type casting convert one data type to another
		System.out.println("Area of circle=>"+area);

	}

}
