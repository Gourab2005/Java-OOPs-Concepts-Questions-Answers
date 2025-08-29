// Write a java program to check whether a year is Leap Year.
import java.util.*;
public class Leapyear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int y = sc.nextInt();
        int result = (y%4==0)?((y%100==0)?((y%400==0)?1:0):1):0;
        if(result==1){
            System.out.println("This is a leap year!");
        }else{
            System.out.println("This is not a leap year!");
        }
    }
}