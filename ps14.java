import java.util.*;

public class ps14 {
    public static void main(String[]  agrs){
        Scanner sc = new Scanner(System.in);
        int arr[] = {87,99,500,300,4,5,1};

        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[0]){
                max = arr[i];
            }
            if(arr[i]<arr[0]){
                min = arr[i];
            }
        }
        System.err.println(max);
        System.err.println(min);
        
    }
}
