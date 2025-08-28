// Write a java program to swap two variables using and without using third variable. 
import java.util.*;
public class SwapVariables{
    public static void swapWithoutTemp(int num1,int num2){
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After swapping: x = " + num1 + ", y = " + num2);
    }
    public static void swapWithTemp(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2=temp;
        System.out.println("After swapping: x = " + num1 + ", y = " + num2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("-------------without temp--------------");
        swapWithoutTemp(a,b);
        System.out.println("------------with temp--------------");
        swapWithTemp(a,b);
    }
}