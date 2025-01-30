// package apna;
import java.util.*;
public class ps2 {
    public static void main (String[] args){
        Scanner sc =   new Scanner(System.in);
        boolean flag = false;
        int num  =  sc.nextInt();
        if(num == 0 || num ==1){
             flag = true;
        }

        for(int i = 2; i<=num/2; ++i){
            if(num % i == 0){
                flag = true;
                break;   
            }
        }


        if(!flag){
            System.out.println(num + " Num is prime");
        }else{
            System.out.println(num + " Num is nonprime");
        }

    }
}
