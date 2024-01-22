package loopsconditions;

public class PatternPrint {
    public void patterns() {
        // Loop for each row
        for (int i = 1; i <= 5; i++) {
            // Print '+' characters
            for (int j = 1; j <= 6 - i - 1; j++) {
                System.out.print("+");
            }
            // Print '-' characters
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("-");
            }
            // Move to the next line
            System.out.println();
        }

    }
}
