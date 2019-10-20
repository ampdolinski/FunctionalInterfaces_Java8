package today_tasks._5_zadanie5_predicate_cd;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main{

    public static void main(String[] args) {

        Urlop urlop1 = new Urlop(LocalDate.of(2018,7,13), LocalDate.of(2018,8,13));
        Urlop urlop2 = new Urlop(LocalDate.of(2019,2,3), LocalDate.of(2019,3,21));

        System.out.println("Ustaw datę dod sprawdzenia w formacie yyyy <Enter> mm <Enter> dd:");
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();
        int miesiac = scanner.nextInt();
        int dzien = scanner.nextInt();



        DataKontrolna data1 = new DataKontrolna(LocalDate.of(rok, miesiac, dzien));

        Predicate<Urlop> aktualnaDataCzyToUrlop = urlop -> {
            LocalDate dataTest = data1.getDataKontrolna();
            return !dataTest.isBefore(urlop.getDataOd()) && !dataTest.isAfter(urlop.getDataDo());
        };


//        ZweryfikujUrlop zweryfikujUrlop = new ZweryfikujUrlop(data1);

//        System.out.println("Czy urlop trwał w dniu " + data1 + " ? - " + zweryfikujUrlop.test(urlop1));
//        System.out.println("Czy urlop trwał w dniu " + data1 + " ? - " + zweryfikujUrlop.test(urlop2));



//        Predicate<Urlop> aktualnaDataCzyToUrlop = urlop -> {
//            LocalDate dzisiaj = LocalDate.now();
//            return !dzisiaj.isBefore(urlop.getDataOd()) && !dzisiaj.isAfter(urlop.getDataDo());
//        };

        System.out.println(aktualnaDataCzyToUrlop.test(urlop1));
        System.out.println(aktualnaDataCzyToUrlop.test(urlop2));

    }

}