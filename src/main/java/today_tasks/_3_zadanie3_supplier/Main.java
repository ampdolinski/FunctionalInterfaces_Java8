package today_tasks._3_zadanie3_supplier;

import today_tasks._1_zadanie1.Czlowiek;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Supplier<LocalDateTime> aktualnaData = LocalDateTime::now;
//        System.out.println(aktualnaData.get());
//        Thread.sleep(5000);
//        System.out.println(aktualnaData.get());

        Supplier<Integer> wylosuj = () -> new Random().nextInt(11);
        System.out.println(wylosuj.get());
        System.out.println(wylosuj.get());
        System.out.println(wylosuj.get());

        Supplier<Czlowiek> nowyCzlowiek = () -> new Czlowiek("Jurand");
        Supplier<Czlowiek> nowyCzlowiekRef = Czlowiek::new;
        System.out.println(nowyCzlowiek.get());
        System.out.println(nowyCzlowiekRef.get());

    }
}
