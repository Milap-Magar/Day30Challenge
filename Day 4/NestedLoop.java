import java.util.Scanner;

public class NestedLoop {
     public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int rows;
        int col;
        String symbol = "";

         System.out.println("Enter the no. of rows: ");
         rows = sc.nextInt();
         System.out.println("Enter the no. of columns: ");
         col = sc.nextInt();
         System.out.println("Enter symbol to use");
         symbol = sc.next();

         for(int i = 1; i<rows; i++){
             System.out.println();
             for(int j = 1; j <= col; j++){
                 System.out.println(symbol);
             }
         }
     }
}
