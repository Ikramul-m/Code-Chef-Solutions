/* package codechef; // don't place package name! */

import java.io.*;
import java.lang.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i = 1; i <= t; i++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      if ((n + m) > 6) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    // 		System.out.println(n + " " +m);
  }
}
