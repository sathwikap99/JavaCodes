package loopsconditions;

public class Main {
    public static void main(String[] args) {

        Reverse reverse = new Reverse();
        System.out.println(reverse.reverseDigits(12345));

        System.out.println();

        AgeCalculator calc = new AgeCalculator();
        calc.printCategory(15);

        System.out.println();

        FibonacciSeries fib = new FibonacciSeries();
        fib.printFibonacciSeries(10);

        System.out.println();

        PatternPrint pattern = new PatternPrint();
        pattern.patterns();

        System.out.println();

        FizzBuzz fizz  = new FizzBuzz();
        fizz.buzzcategory();





    }
}
