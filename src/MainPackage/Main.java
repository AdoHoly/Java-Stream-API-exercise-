package MainPackage;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> list =new ArrayList<Book>();
        list.add(new Book("It Ends with Us", 43));
        list.add(new Book("Book1", 78));
        list.add(new Book("Woman on Fire", 56));
        list.add(new Book("Hagakure", 23));
        list.add(new Book("aBook",4));
        list.add(new Book("x",47));
        list.add(new Book("hbo", 80));
        list.add(new Book("The Library of the Dead", 89));
        list.add(new Book("The tobacco Wives", 36));
        list.add(new Book("mko", 24));
        list.add(new Book("elkokniha", 687));
        list.add(new Book("dakadalsiakniha", 798));
        list.add(new Book("Pan prstenov", 3500));
        list.add(new Book("Madhouse", 41));
        list.add(new Book("How to learn java for dummies", 15));

        System.out.println("First exercise");
        System.out.println(IntStream.iterate(1, A -> A+1)
                .limit(10000)
                .filter(A -> A % 3 == 0 && A % 5 == 0 && A % 7 != 0)
                .sum()
        );
        System.out.println();
        System.out.println("Second Exercise");
        IntStream.iterate(2, A-> A + 2)
                .limit(100)
                .filter(A -> A % 8 != 0)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Exercise 3.1: ");
        list.stream()
                .filter(A -> A.getPrice() < 100)
                .sorted(Comparator.comparing(b -> b.getName()))
                .forEach(b -> System.out.println(b.getName()));

        System.out.println();
        System.out.println("Exercise 3.2: ");
        System.out.println(
                list.stream()
                        .filter(A -> A.getName().length() < 5)
                        .count()
        );

        System.out.println();
        System.out.println("Exercise 3.3: ");
        System.out.println(
                list.stream()
                        .mapToDouble(Book::getPrice)
                        .average()

        );

        System.out.println();
        System.out.println("Exercise 3.4: ");
        System.out.println(
                list.stream()
                        .anyMatch(A -> A.getPrice() > 500)
        );





    }
}
