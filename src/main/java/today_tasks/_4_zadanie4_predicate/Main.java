package today_tasks._4_zadanie4_predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//        Predicate<String> ciagZnakow = tekst -> tekst != null;           - to samno, tylko jako lambda
        Predicate<String> ciagZnakow = Objects::nonNull;

        System.out.println(ciagZnakow.test("blabla"));
        System.out.println(ciagZnakow.test("null"));
        System.out.println(ciagZnakow.test(""));
        System.out.println(ciagZnakow.test(null));
        System.out.println();

        Predicate<String> ciagZnakow2 = String::isEmpty;
        System.out.println(ciagZnakow2.test("blabla"));
        System.out.println(ciagZnakow2.test("null"));
        System.out.println(ciagZnakow2.test(""));
//        System.out.println(ciagZnakow2.test(null));
        System.out.println();

        Predicate<String> komozyt = ciagZnakow.and(ciagZnakow2);
        System.out.println(komozyt.test("blabla"));
        System.out.println(komozyt.test("null"));
        System.out.println(komozyt.test(""));
        System.out.println(komozyt.test(null));
        System.out.println();

        Predicate<String> kompozyt2 = ciagZnakow.or(ciagZnakow2);
        System.out.println(kompozyt2.test("blabla"));
        System.out.println(kompozyt2.test("null"));
        System.out.println(kompozyt2.test(""));
//        System.out.println(kompozyt2.test(null));
        System.out.println();

        Predicate<String> negacja = ciagZnakow.negate();
        System.out.println(negacja.test("blabla"));
        System.out.println(negacja.test("null"));
        System.out.println(negacja.test(""));
        System.out.println(negacja.test(null));
        System.out.println();

        Predicate<String> negacja2 = ciagZnakow2.negate();
        System.out.println(negacja2.test("blabla"));
        System.out.println(negacja2.test("null"));
        System.out.println(negacja2.test(""));
//        System.out.println(negacja2.test(null));
        System.out.println();



    }
}
