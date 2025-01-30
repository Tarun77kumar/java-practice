import java.util.*;
public class ps11 {

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = (a>b)? a:b ;
        while(true){
            if(ans%a==0 && ans%b==0)
            break;
            ans++;
        }
        System.err.println("LCM of "+a +" and "+b+" = "+ans  );
    }
}
