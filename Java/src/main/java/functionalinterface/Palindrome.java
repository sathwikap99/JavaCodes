package functionalinterface;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }

            scanner.close();
        }

        // Function to check if a number is a palindrome
        public static boolean isPalindrome(int num) {
            int originalNum = num;
            int reversedNum = 0;

            if(num < 0) {
                return false;
            }

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num/= 10;
            }

            return originalNum == reversedNum;
        }
    }


