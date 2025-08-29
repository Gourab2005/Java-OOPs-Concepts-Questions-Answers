// Write a java program to generate Fibonacci Series up-to n terms using loop.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci series: ");
        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        int term1 = 0;
        int term2 = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(term1 + " ");
            int nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
        }
        System.out.println();
    }
}
