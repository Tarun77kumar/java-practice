import java.util.*;
public class ps38 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        while (n>0) {
            int temp = n%10;
            sum += (temp*temp);
            n = n/10;  
        }
        System.out.println(sum);
    }
}
