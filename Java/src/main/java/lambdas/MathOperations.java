package lambdas;
interface MathOperation {
    int operate(int a, int b);
}

    public class MathOperations {
        public static void main(String[] args) {
            // Implementing addition using a lambda expression
            MathOperation addition = (a, b) -> a + b;

            // Testing the addition operation
            int result = addition.operate(5, 3);
            System.out.println("Result of addition: " + result);
        }
    }


