import java.util.*;
public class ps25 {
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while(x>0){
             x = x/10;
             count++;
                }
         System.out.println(count);
    }
}
