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
		    int x = sc.nextInt();  //Number of weeks attended
		    int y = sc.nextInt();  //coins per week
		    
		    int cost = x * y;  //total amount of money that Chef will have to pay
		    
		    System.out.println(cost);
		    
		}
	}
}
