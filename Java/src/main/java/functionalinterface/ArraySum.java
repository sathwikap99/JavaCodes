package functionalinterface;

public class ArraySum {

    // Function to calculate the sum of an array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

