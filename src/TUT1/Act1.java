package src.TUT1;

//linear scan
public class Act1 {
    public static int find_max(int [] arr, int n ){
        int max_val = arr[0];
        for (int i = 1;i<n;i++ ){
            if (arr[i]>max_val) {
                max_val = arr[i];
            }
        }
        return max_val;
    }
}
