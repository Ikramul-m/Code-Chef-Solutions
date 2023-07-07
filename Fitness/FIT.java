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
		    int x = sc.nextInt(); //distance between Chef's office & his home.
		    
		    int k = (2*x) * 5;  // number of kilometers Chef travels through office trips in a week.
		    
		    System.out.println(k);
		}
	}
}
