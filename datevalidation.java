import java.util.Scanner;

public class datevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int mon = sc.nextInt();
        int year = sc.nextInt();
        if(year>1500 && year<2500 ){
          if(year%4==0){
            if(mon==2 && date<=29){
              System.out.println("valid");
            }
          }
          else{
            if(mon==1 || mon==3 || mon==5|| mon==7|| mon==8 || mon==10 || mon==12){
              if(date<=31){
                System.out.println("valid");
              }
              else{
                System.out.println("unvalid");
              }
            }
            elseif(mon==4 || mon==6 || mon==9 || mon==11){
              if(date<=30){
                System.out.println("valid");
              }
              else{
                System.out.println("unvalid");
              }
            }
            elseif(mon==2){
              if(date<=28){
                System.out.println("valid");
              }
              else{
                System.out.println("unvalid");
              }
            }
          }
        }
  }
}
