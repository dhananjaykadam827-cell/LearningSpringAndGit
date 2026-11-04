package One.classDemo.functionalInterfaceEnum.StreamLearning;

import java.util.Comparator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public StreamDemo() {
    }

    static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Atomic Habits", 2018, 450.0, "Self-Help"),
                new Book("The Alchemist", 1988, 300.0, "Fiction"),
                new Book("Rich Dad Poor Dad", 1997, 350.0, "Finance"),
                new Book("The Hobbit", 1937, 400.0, "Fantasy"),
                new Book("Dune", 1965, 500.0, "Science Fiction"),
                new Book("Wings of Fire", 1999, 250.0, "Autobiography"),
                new Book("Ikigai", 2016, 300.0, "Self-Help"),
                new Book("Sapiens", 2011, 550.0, "History"),
                new Book("The Da Vinci Code", 2003, 400.0, "Mystery"),
                new Book("Harry Potter and the Philosopher's Stone", 1997, 450.0, "Fantasy")
        );

        //filter books price higher than 500
        Stream<Book> filertBooks = books.stream().filter(book -> book.price < 500);
        filertBooks.forEach(System.out::println);

        //convert book titles to uppercase
        Stream<String> stream2 = books.stream()
                .map(book -> book.title.toUpperCase());
                stream2.forEach(System.out::println);

                //sort books by publication date
        Stream<Book> stream3 = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationDate));
        stream3.forEach(System.out::println);
        System.out.println();

        // remove duplicate title
        Stream<Book> stream4 = books.stream().distinct();
        stream4.forEach(System.out::println);
        System.out.println();

        // limit display only 3 books
        Stream<Book> stream5 = books.stream().sorted(Comparator.comparingInt(book->book.publicationDate)).limit(3);
        stream5.forEach(System.out::println);
        System.out.println();

        //skip
        Stream<Book> stream6 = books.stream().skip(2);
        stream6.forEach(System.out::println);
    }

}
