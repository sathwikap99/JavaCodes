package objectarrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, 2d, 10d);
        Product prod2 = new Product(2, 1d, 20d);
        System.out.println(prod1.compareTo(prod2) > 0 ? "Product 1 is expensive" : "Product 2 is expensive");

        Movie movie1 = new Movie(2004, 5.0, 20.0, 50.0);
        Movie movie2 = new Movie(2016, 4.8, 250.0, 500.0);
        System.out.println(Movie.ratingAndProfitComparator.compare(movie1, movie2) > 0 ? "Movie 1 has more rating and profit than Movie 2" : "Movie 2 has more rating and profit than Movie 1");
        System.out.println(Movie.yearAndRatingComparator.compare(movie1, movie2) > 0 ? "Movie 1 is earliest and  has more rating than Movie 2" : "Movie 2 is earliest and has more rating than Movie 1");

        Person p1 = new Person("123456789", "1234567890", 5.4, 50.0);
        Person p2 = new Person("987654321", "0987654321", 5.11, 60.0);
        System.out.println("Both SSN are " + (p1.equals(p2) ? "" : "not ") + "equal");

    }
}
