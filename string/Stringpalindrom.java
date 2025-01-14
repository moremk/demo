package string;
import java.io.*;
import java.util.*;

public class Stringpalindrom {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
    char ch[]=A.toCharArray();
    String rev="";
    for(int i=ch.length-1;i>=0;i--)
    {
        rev +=ch[i];
    }
    if(rev.equals(A))
    {
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
        
    }
}



