package today_tasks._1_zadanie1;

public class Czlowiek implements IPotrafiacyJesc {

    private String imie;

    public Czlowiek() {
        System.out.println("Tworzę człowieka");
    }

    public Czlowiek(String imie) {this.imie = imie;}

    public static void przywitajSie() {
        System.out.println("Cześć - metoda statyczna.");
    }

    public void ziewnij(){
        System.out.println("AAAAaaaaAAAAAAAaaaa - metoda instancji.");
    }

    public static void zerknijNa(String cos){
        System.out.println("Zerkam na: " + cos + " - metoda statyczna.");
    }


    public void przygladajSie(String czemus){
        System.out.println("Przyglądam się: " + czemus + " - metoda instancji.");
    }


    @Override
    public void jedz(String cos) {
        System.out.printf("Mogę zjeść %f", cos);
    }
}
