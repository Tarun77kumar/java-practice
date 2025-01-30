import java.util.*;
public class ps4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp ,digit = 0 , sum = 0 , last = 0;
        temp = num;
        while(temp>0){
            temp = temp/10;
            digit++;
        }
        temp = num ;
        while(temp>0){
            last = temp%10;
            sum += (Math.pow(last, digit));
            temp = temp/10;  
        }
        if(num == sum){
            System.out.println(num +  " the is armstorge");
        }
        else{
            System.out.println(num +  " the isnot armstorge");
        }
    }
} 
