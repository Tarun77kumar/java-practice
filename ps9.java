

// GCD


package apna;
import java.util.*;

public class ps9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int gcd = 1 ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i= 1; i<=a && i<=b ; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(a + " and " + b + " GCD = " +gcd);

    }
}

