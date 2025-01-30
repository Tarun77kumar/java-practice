import java.util.*;
public class ps28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int fact = 1;
        if(num == 0 || num == 1){
            System.out.println(1);
        }
        for (int i = 1; i <=num; i++) {
            fact = fact*i;
        }
       
        while(fact>0){
            fact = fact%10;  
        }        
    }
}

