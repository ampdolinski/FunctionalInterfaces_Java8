package today_tasks._2_zadanie2_consumer;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę:");
        Scanner scanner = new Scanner(System.in);

        Consumer<Integer> mojKonsument = liczba -> System.out.println(liczba*liczba);
    mojKonsument.accept(5);

    Consumer<String> wielkieLitery = ciagZnakow -> System.out.println(ciagZnakow.toUpperCase());

    Consumer<String> dlugosc = ciagZnakow -> System.out.println(ciagZnakow.length());

    Consumer<String> kompozyt = wielkieLitery.andThen(dlugosc);

        kompozyt.accept("cos Tam");
        wielkieLitery.accept("");

    }
}
