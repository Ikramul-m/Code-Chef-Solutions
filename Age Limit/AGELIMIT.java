/* package codechef; // don't place package name! */

import java.io.*;
import java.lang.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

  public static void main(String[] args) throws java.lang.Exception {
    // your code goes here

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i = 1; i <= t; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();

      if (a >= x && a < y) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
