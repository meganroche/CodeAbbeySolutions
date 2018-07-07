/*
Takes in two variables from the scanner and adds then together.
We then print the solution
*/

import java.util.Scanner;

public class sum_a_b {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(), c = a + b;
        System.out.printf("%d",c);
        sc.close();
    }
}