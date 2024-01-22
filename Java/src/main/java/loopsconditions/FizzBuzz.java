package loopsconditions;

public class FizzBuzz {
    public void buzzcategory() {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check divisibility by both 3 and 5 first
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check divisibility by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check divisibility by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Print the number if not divisible by 3 or 5
            else {
                System.out.println(i);
            }
        }
    }
}
