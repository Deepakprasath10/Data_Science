
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int total = 0;
        for (int i =2; i<=dis;i++){
            total = num1 + num2;
            num2 = num1;
           num1 = total;
            System.out.println(total);
        }

    }
}
