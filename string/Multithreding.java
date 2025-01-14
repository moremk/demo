package string;

public class Multithreding extends Thread{
	
	
	public void run()
	{
		for(int i=1;i<=30;i++)
		{		
			System.out.print(" " +i);
			try {
				Thread.sleep(50);			
				}
			catch(Exception e)
			{
				System.out.println("not handle exception");
			}
			 if (i == 10) {
	                System.out.println(); 
	            }
			 if (i == 20) {
	                System.out.println(); 
	            }
			 if (i == 30) {
	                System.out.println(); 
	            }
		}
			
		System.out.println();
		
	}

	public static void main(String[] args) throws InterruptedException  {
		
		Multithreding thread=new Multithreding();
		thread.start();
		
		
		

	}

}
