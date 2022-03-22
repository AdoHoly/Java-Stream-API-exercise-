package MainPackage;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("First exercise");
        System.out.println(IntStream.iterate(1, A -> A+1)
                .limit(10000)
                .filter(A -> A % 3 == 0 && A % 5 == 0 && A % 7 != 0)
                .sum()
        );


    }
}
