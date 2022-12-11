// Programmer: Alexander Pascu
// Program Name: Factorials.java
// Date: 12/08/2022
// Version: 1.0
// This program displays the factorial for every integer value from 1 to 10. 
// A factorial of a number is the product of that number multiplied by each positive integer lower than it
public class Factorials {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      int factorial = 1;
      for (int j = 1; j <= i; j++) {
        factorial *= j;
      }
      System.out.println(i + "! = " + factorial);
    }
  }
}
