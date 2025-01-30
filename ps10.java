package apna;
import java.util.*;
public class ps10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int LCM = 1;
        int x = sc.nextInt();
        int y = sc.nextInt();
       for(int i =1 ; i<=x && i<=y ; i++){
        if(x%i == 0 || y%i == 0){
            LCM = i;
        }
       }
       System.out.print(x + " and " + y + " LCM is "+ LCM );
        
        
    }
}