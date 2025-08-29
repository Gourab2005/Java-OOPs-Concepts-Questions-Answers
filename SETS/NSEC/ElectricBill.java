import java.util.*;
public class ElectricBill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        if(unit<=200){
            System.out.println("Bill is : "+(unit*0.50));
        }else if(unit>=201 && unit<=400){
            System.out.println("Bill is : "+(100+(unit*0.65)));
        }else if(unit>=401 && unit<=600){
            System.out.println("Bill is : "+(200+(unit*0.80)));
        }else if(unit>401){
            System.out.println("Bill is : "+(300+(unit*1)));
        }else{
            System.out.println("invalid input!");
        }
    }
}