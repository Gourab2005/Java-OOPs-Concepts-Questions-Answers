// Write a java program which will take radius of a Circle as user input and calculate area and perimeter to display the results.
import java.util.*;
public class AreaPerimeter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        sc.close();
        double area = Math.PI*radius*radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + String.format("%.2f",area));
        System.out.println("The perimeter of the circle is: " + String.format("%.2f",perimeter));
    }
}