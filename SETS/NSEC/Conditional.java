// Write a java program to identify largest among three numbers using Conditional Operator (? :).
import java.util.*;
public class Conditional{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a : ");
        int a  = sc.nextInt();
        System.out.println("Enter the number b : ");
        int b = sc.nextInt();
        System.out.println("Enter the number c : ");
        int c = sc.nextInt();
        int ans = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("The max of "+a+","+b+","+c+","+" is "+ans);
    }
}