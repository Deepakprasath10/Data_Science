import java.util.*;
public class dayscalci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int year = a/365;
        int b = a%365;
        int week = b/7;
        int c = a%7;
        int days = c;
        System.out.println(year+" year");
        System.out.println(week+" weeks");
        System.out.println(days+" days");
        
    }
    
}
