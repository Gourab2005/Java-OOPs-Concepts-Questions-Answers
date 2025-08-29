// In general an equation of the form 𝑎𝑥2 + 𝑏𝑥+𝑐 =0 is known as quadratic equation. Accept the values of a, b, 
// and c from the user and write a java program to calculate the roots of the given quadratic equation.    
// C. Write a java program to check whether a year is Leap Year.
import java.util.*;
public class Quadratic{
    public static void main(String args[]){
        //taking input from user of a , b and c 
    Scanner sc = new Scanner(System.in);
    System.out.println("value of a = ");
    double a = sc.nextDouble();
    System.out.println("value of b = ");
    double b = sc.nextDouble();
    System.out.println("value of c = ");
    double c = sc.nextDouble();

    double x = (b*b) - (4*a*c);
    if(x>0){
        double root1 = (-b + Math.sqrt(x))/2*a;
        double root2 = (-b - Math.sqrt(x))/2*a;
        System.out.println("The root1 is : "+root1+" "+"The root2 is : "+root2);
    }else if(x==0){
        double root = -b/(2*a);
        System.out.println("The roots are same and the root is : "+root);
    }else{
        System.out.println("There are imaginary roots!");
    }
    }
}