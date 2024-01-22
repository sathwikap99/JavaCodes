package arrays;

public class Rotate {
    public int[] rotate(int[] arr, int k) {
        int[] rotated = new int[arr.length];
        for(int i = k; i < arr.length; i++) {
            rotated[i-k] = arr[i];
        }
        for(int i = 0; i < k; i++) {
            rotated[arr.length-k+i] = arr[i];
        }
        return rotated;
    }
}
