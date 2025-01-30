import java.util.*;
public class ps46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;
        for(int i = 0 ; i < name.length(); i++){
            count++;
        }
        System.out.println(count);
    }

}
