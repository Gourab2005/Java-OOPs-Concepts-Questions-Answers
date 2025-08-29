// Write a java program to calculate y = x^n, where x and n are user inputs, using loop.
import java.util.*;
public class Power{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n = sc.nextInt();
        int result = 1;
        for(int i=1;i<=n;i++){
            result=result*X;
        }
        System.out.println("The result is : "+result);
    }

}