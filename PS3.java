package apna;
import java.util.*;
public class PS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year  = sc.nextInt();
        boolean flag = false;
        if(Year % 4 ==0 ){
            flag = true;
            if(Year %100 == 0){
                if(Year%400 == 0){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
        }
        else{
            flag = false;
        }

        if(!flag){
            System.out.println("year is not leap");
        }else{
            System.out.println("year is  leap");

        }
    }
}
