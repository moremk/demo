package string;

import java.util.Scanner;

public class Printstatementnewlinewithnumber {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	int line=1;
	System.out.println("enter a name=>");
	while(sc.hasNext())
	{
		String name=sc.next();
		System.out.println(line+" "+name);
		line++;
	}
			
		
	
	}

}
