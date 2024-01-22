package arrays;

import java.util.Arrays;

public class MinMax {
    public int getMin(int[] arr) {
        Arrays.sort(arr);
        return (arr != null || arr.length != 0) ? arr[0] : null;
    }

    public int getMax(int[] arr) {
        Arrays.sort(arr);
        return (arr != null || arr.length != 0) ? arr[arr.length - 1] : null;
    }
}

