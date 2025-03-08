// import java.util.*;
public class ps5 {
    static int n1 = 0 ,n2 =1 ,n3 ,limit = 10;
    public static void FS(int n){
        if(limit>0){
            n3 = n1+n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
            FS(limit-1);
        }
       
    }

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int limit = sc.nextInt();
        // int n1 = 0 , n2 = 1 ,n3 ;
        // System.out.print(n1+ " " +n2);
        // for(int i = 2; i < limit; i++){
        //     n3 = n1+n2;
        //     System.out.print(" "+n3);
        //     n1 =n2;
        //     n2 = n3;
        // }
        System.out.println(n1+" "+n2);
        FS(10);
    }
}