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
		
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    if(a>b)
		    {
		        if(b>c)
		        {
		            System.out.println(b);
		        }
		        else if(a>c)
		        {
		            System.out.println(c);
		        }
		        else
		        {
		            System.out.println(a);
		        }
		    }
		    else
		    {
		        if(a>c)
		        {
		            System.out.println(a);
		        }
		        else if(b>c)
		        {
		            System.out.println(c);
		        }
		        else
		        {
		            System.out.println(b);
		        }
		    }
		  
		   
		}
	}
}
