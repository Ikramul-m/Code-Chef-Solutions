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
		
		int n = sc.nextInt(); // number of new users
		int a = sc.nextInt(); // number of users who just saw the problem
		int b = sc.nextInt(); // users who made a submission but could not solve any problem correctly
		
		int rating = n - a;
		
// 		System.out.print(rating);
		
		int greatRating = rating - b;
		
		System.out.println(rating+ " " +greatRating);
	}
}
