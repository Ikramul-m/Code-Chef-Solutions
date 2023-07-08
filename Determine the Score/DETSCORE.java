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
		    int x = sc.nextInt(); //Total points for the problem
		    int n = sc.nextInt(); //Number of test cases which pass for Chef's solution
		    
		    int totalScore = (x/10) * n;
		    
		    System.out.println(totalScore);
		    
		}
	}
}
