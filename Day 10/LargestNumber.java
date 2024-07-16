package src;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any one number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter any one number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter any one number: ");
        int num3 = sc.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("Largest: " + num1);
        }
        else{
            if(num1 > num2 && num2 > num3 ){
                System.out.println("Largest :" + num1);
            }
            else if(num1 < num2 && num2 < num3 ){
                System.out.println("Largest :" + num3);
            }
            else{
                System.out.println("Largest: " + num2);
            }
        }
    }
}
