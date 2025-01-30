import java.util.*;
public class ps15 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int sum = 0;
        int  n = sc.nextInt();  
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
           arr[i] = sc.nextInt(); 
        }
        for(int j = 0; j<n ; j++){
            sum += arr[j];
        }
        System.out.println(sum);
    }
}
