package arrays;

public class Search {
    public int search(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                return i+1;
            }
        }
        return -1;
    }
}
