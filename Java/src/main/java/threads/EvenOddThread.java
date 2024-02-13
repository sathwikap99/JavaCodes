package threads;

public class EvenOddThread implements Runnable{
    int range;
    int rem;
    String name;

    public EvenOddThread(int range, int rem, String name) {
        this.range = range;
        this.rem = rem;
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < range; i++) {
            if(i%2 == rem) {
                System.out.println(name+"-"+i);
            }
        }
    }
}
