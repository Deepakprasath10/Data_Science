
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {   
       Scanner sc = new Scanner(System.in);
       int b = sc.nextInt();
      
       int factorial = 1;
       for(int i = 1;i<=b;i++){
       factorial *=i;
       
       }
       System.out.println(factorial);
    }
}
