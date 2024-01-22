package arrays;

public class ReverseArray {
    public int[] reverse(int[] arr) {
        int[] revarr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            revarr[arr.length-i-1] = arr[i];
        }
        return revarr;
    }
}
