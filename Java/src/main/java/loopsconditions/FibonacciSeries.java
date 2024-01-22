package loopsconditions;

public class FibonacciSeries {
    public void printFibonacciSeries(int N) {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(n1 + " ");

            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
