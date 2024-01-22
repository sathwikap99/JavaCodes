package loopsconditions;

public class Reverse {
    public int reverseDigits(int n) {
        int revNum = 0;
        while (n != 0) {
            int digit = n % 10;
            revNum = revNum * 10 + digit;
            n /= 10;
        }
        return revNum;
    }
}
