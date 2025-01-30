public class ps45 {
    public static void main(String[] args){
        int arr[] = {1,1,2,22,9,22,9,9,22,22,4,6,8,22,22,1};
        int max_count = 0;
        int max_frq = 0;
        
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>max_count){
                max_count = count;
                max_frq = arr[i];
            }
        }
        System.out.println(max_frq);

    }
}
