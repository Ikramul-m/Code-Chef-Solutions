/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1 ; i<=t ; i++)
		{
		    int n = sc.nextInt();//The number of required donations 
		    int x = sc.nextInt();//The number of collected donations
		    
		    int remain = n - x;//The remaining number of donations needed to reach the target
		    
		    System.out.println(remain);
		}
	}
}
