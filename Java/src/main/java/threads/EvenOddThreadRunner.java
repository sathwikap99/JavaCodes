package threads;

public class EvenOddThreadRunner {
    public static void main(String[] args) {
        EvenOddThread t1 = new EvenOddThread(60, 0, "Even");
        Thread evenThread = new Thread(t1);

        EvenOddThread t2 = new EvenOddThread(60, 1, "Odd");
        Thread oddThread = new Thread(t2);

        evenThread.start();
        oddThread.start();

    }


}
