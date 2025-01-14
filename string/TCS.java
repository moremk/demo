package string;
import java.util.Scanner;
public class TCS {
	
	private String girls="";
	private int age;
	
	public TCS()
	{
		
	}
	public TCS(String gl,int ag)
	{
		this.girls=gl;
		this.age=ag;
	}
	
	public String toString()
	{
		return "name=>"+girls;
	}

	public static  void main(String[] args) {
	
      Scanner sc=new Scanner(System.in);
      
      TCS tcs=new TCS();
      
      System.out.println("Enter a how many girls name=>");
      int n=sc.nextInt();
      
      String name[]=new String[n];
      int  age[]=new int[n];
      
  
      System.out.println("Enter girls name =>");
      for(int i=0;i<n;i++)
      {
    	  name[i]=sc.next();  
      } 
      System.out.println("Enter girls age=>");
      for(int i=0;i<n;i++)
      {
    	  age[i]=sc.nextInt();   
      }
      for(int i=0;i<n;i++)
      {
      if(age[i]>=18 && age[i]<=20)
      {
    	  tcs = new TCS(name[i], age[i]);
          System.out.println(tcs.toString());
      }
    
      
	}
     
	}
}
