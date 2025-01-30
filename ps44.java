import java.util.*;
public class ps44 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int arr[] = { 1,2,3,4,5};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = count + arr[i];
        }
        int avr = count/n;
        System.out.println(avr);
    }
}
