import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;

public class ps34{
    public static boolean AC(String s1,String s2){
        char[] arr1= s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(AC(s1,s2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}