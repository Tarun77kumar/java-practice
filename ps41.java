import java.util.*;
public class ps41{
public static void main(String[] args){
    Scanner  sc = new  Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    while(a>0){
        int rem = a%10;
        if(rem == b){
            count++;
        }
        a /= 10;
    }
    System.out.println(b + " is occure " + count);
}
    
}