// Write a java program to generate all Prime Numbers within a range, where range is user input.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number till which you want to check: ");
        int last = sc.nextInt();
        sc.close();
        System.out.println("Prime numbers up to " + last + " are:");
        for (int i = 2; i <= last; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
