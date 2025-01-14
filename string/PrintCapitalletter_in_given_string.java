package string;

public class PrintCapitalletter_in_given_string {

	public static void main(String[] args) {
	String str="Mahesh MorE";
    char [] ch=str.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
    	if(Character.isUpperCase(ch[i]))
    	{
    		System.out.println("Uppercase letter=>"+ch[i]);
    	}
    	
    }
    
   
	}

}
