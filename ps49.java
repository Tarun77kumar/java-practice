import java.util.*;
public class ps49 {
    public static int SLE(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n-2; i >= 0 ; i--) {
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }  
    
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,8,8,8};
        System.out.println(SLE(arr));
    }
}  
