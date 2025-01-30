import java.util.*;
public class ps23{
    public static void main(String[] agrs){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a = 0 ,b = 1;
       System.out.print(a+" "+b);
       for(int i =2; i<n ;i++){
        int c =a+b;
        System.out.print(" "+c);
        a = b;
        b =c ;

       }
    }
}
