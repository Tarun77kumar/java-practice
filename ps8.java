// import java.util.Scanner;
// public class ps8 {
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
//         int fact = 1;
//         if(n == 0  ||n==1){
//             System.out.println("1");
//         }
//         for(int i =1; i<=n ; i++){
//             fact = fact *i;
//         }
//         System.out.println(fact);
       
//     }
// }

import java.util.*;
public class ps8 {

    public static void main(String[] args ){
        Scanner s1 = new Scanner(System.in);
        int num = s1.nextInt();
        int fact = 1;
        if(num == 0 || num==1){
            System.out.println("1");
        }
         for (int i = num;  i>0; i--) {
                fact = i*fact;
            }
            System.out.println(fact);
        
    }
}
