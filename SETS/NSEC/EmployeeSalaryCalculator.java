/**
 * This program calculates the total salary of an employee based on user-provided basic pay.
 * It follows a specific salary structure:
 * - AGP is 50% of the basic pay.
 * - Merged basic pay is the sum of basic pay and AGP.
 * - DA is 50% of the merged basic pay.
 * - HRA is 15% of the merged basic pay.
 * - Total salary is the sum of basic pay, AGP, DA, and HRA.
 */
import java.util.*;
public class EmployeeSalaryCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic salary : ");
        double basicPay = sc.nextDouble();
        double agp = 0.50 * basicPay;
        System.out.println("AGP (50% of Basic Pay): " + agp);
        double mergedBasic = basicPay + agp;
        System.out.println("Merged Basic (Basic + AGP): " + mergedBasic);
        double da = 0.50 * mergedBasic;
        System.out.println("DA (50% of Merged Basic): " + da);
        double hra = 0.15 * mergedBasic;
        System.out.println("HRA (15% of Merged Basic): " + hra);
        double totalSalary = basicPay + agp + da + hra;
        System.out.println("-------------------------------------");
        System.out.println("Total Salary: " + totalSalary);
        sc.close();
    }
}