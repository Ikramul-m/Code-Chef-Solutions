import java.lang.*;
import java.util.*;
import java.io.*;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) throws java.lang.Exception {
	    
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1 ; i<=t ; i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int sum = a+b;
		    
		    System.out.println(sum);
		}


	}
}