
    import java.util.*;
    public class ps22 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();
            int last  = sc.nextInt();
            int sum = 0;
    
            for(int i = start; i<= last; i++){
                if(i%2 != 0){
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
