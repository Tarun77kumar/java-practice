
public class ps30 {

    public static void main(String[] args){
        int[] arr = {2,4,8,10,12,16};

        int  n = arr.length + 1;
        int sum = ((n*(n+1))/2)*2;

        for (int i = 0; i < arr.length; i++) {
            sum = sum -arr[i];
        }

        System.out.println("missing no :" + sum);
    }
}