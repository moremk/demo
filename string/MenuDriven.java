package string;
import java.util.*;
public class MenuDriven {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		
		int ch=0;
		
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter your choice=>");
	
		ch=sc.nextInt();
	
		switch(ch)
		{
		
			case 1 : {
				   System.out.println("Addition=>");
			        int a=12;
			        int b=12;
			        int c=a+b;
			        System.out.println(c);
			        break;
			}
			        
			case 2 :{ System.out.println("Substraction=>");
	        int d=12;
	        int e=12;
	        int f=d-e;
	        System.out.println(f);
	        break;
			}
			case 3 : System.out.println("Multiplication=>");
	        int g=12;
	        int h=12;
	        int t=g*h;
	        System.out.println(t);
	        break;
	        
			case 4 : System.out.println("Division=>");
	        int p=12;
	        int q=12;
	        int r=p/q;
	        System.out.println(r);
	        break;
	        
			case 5 : System.out.println("Invalid choice");
			break;
		}
	}
}
	
