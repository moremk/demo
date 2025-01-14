package string;
import java.util.Scanner;
public class ABC {

	private String name="";
	private int age;
	
	public ABC()
	{
		
	}
	public ABC(String nm,int ag)
	{
		this.name=nm;
		this.age=ag;
	}
	
	public String toString()
	{
		return "name="+name+"age=>"+age;
	}
	
	
	
	public static void main(String[] args) {
	
		ABC a=new ABC();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many name and age=>");
		int n=sc.nextInt();
		
		
		String name[]=new String[n];
		int age[]=new int[n];
		
		System.out.println("enter a boys name=>");
		for(int i=0;i<n;i++)
		{
			name[i]=sc.next();
		}
		System.out.println("enter a boys age=>");
		for(int i=0;i<n;i++)
		{
			age[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(age[i] >= 18 && age[i] <= 21)
			{
			  a=new ABC(name[i],age[i]);
			  System.out.println(a.toString());
			}
		}
	}

}
