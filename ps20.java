import java.util.*;
public class ps20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n ==1){
            System.out.println("not allow");
        }
        int sum = 1;

        for(int i = 2 ; i<n; i++){
            if(n%i==0){
                sum += i;
            }      
        }
        System.out.println(" "); 

        if(sum == n){
            System.out.println("it a parfect number");
        }
    }
}
