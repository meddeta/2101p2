


//Student name : Melika Sherafat
//Student ID : 218970871


package mell;

import java.util.Scanner;


public class Coins {
	
  private static final int[] d = {25, 10, 5, 1};
  public static void w(int m) {
      System.out.println("Distinct ways to make change for " + m + " cents:");
      e(m, 0, new int[d.length]);
  }

  private static void e(int r, int i, int[] c) {
      if (r == 0) {
          p(c);
      }
      else if (r > 0 && i < d.length) {
          c[i]++;
          e(r - d[i], i, c);
          c[i]--;
          e(r, i + 1, c);
      }
  }

  private static void p(int[] c) {
      StringBuilder ch = new StringBuilder();
      for (int i = 0; i < c.length; i++) {
          if (c[i] > 0) {
              ch.append(c[i]);
              if (i == 0) ch.append(" quarters, ");
              else if (i == 1) ch.append(" dimes, ");
              else if (i == 2) ch.append(" nickels, ");
              else if (i == 3) ch.append(" pennies");
          }
      }
      System.out.println(ch.toString());
  }

  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter an amount in cents:");
      int a = s.nextInt();
      w(a);
      s.close();
  }
}
