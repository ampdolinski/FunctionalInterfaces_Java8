package today_tasks._1_zadanie1;

public class Main {
    public static void main(String[] args) {

        //podejście 1 - jawna klasa
        IMowiacy jawna = new MowiacyMetodyStatyczne();
        jawna.powiedzCos();

        // podejście 2 - implementacja w locie
        IMowiacy wLocie = new IMowiacy() {
            @Override
            public void powiedzCos() {
                Czlowiek.przywitajSie();
            }
        };

        wLocie.powiedzCos();

        //podejście 3 - lambda

        IMowiacy lambda = () -> Czlowiek.przywitajSie();
        lambda.powiedzCos();


        //podejście 4 - referencja metody
        IMowiacy methodRef = Czlowiek::przywitajSie;
        methodRef.powiedzCos();

        //podejście 1 - jawne

        IMowiacy jawna2 = new ZiewajacyMetodyInstancji();
        jawna2.powiedzCos();

        //podejście 2 - implementacja

        IMowiacy wLocie2 = new IMowiacy() {
            @Override
            public void powiedzCos() {
                new Czlowiek().ziewnij();
            }
        };

        wLocie2.powiedzCos();

        //podejście 3 - lambda

        IMowiacy lambda2 = () -> new Czlowiek().ziewnij();
        lambda2.powiedzCos();


        //podejście 4 - referencja metody
        IMowiacy methodRef2 = new Czlowiek()::ziewnij;
        methodRef2.powiedzCos();

        //podejście 5 - anonimowa instancja Człowiek



        //nowe zadanie

        //podejście 1 - jawna klasa
        IPatrzacy jawna3 = new PatrzacyMetodyStatyczne();
        jawna3.patrzNa("tablica");

        // podejście 2 - implementacja w locie
        IPatrzacy wLocie3 = new IPatrzacy() {
            @Override
            public void patrzNa(String cos) {
            Czlowiek.zerknijNa(cos);
            }
        };

        wLocie3.patrzNa("stół");

        //podejście 3 - lambda

        IPatrzacy lambda3 = (przedmiot) -> Czlowiek.zerknijNa(przedmiot);
        lambda3.patrzNa("kubek");


        //podejście 4 - referencja metody
        IPatrzacy methodRef3 = Czlowiek::zerknijNa;
        methodRef3.patrzNa("zeszyt");

        //podejście 1 - jawne

        IPatrzacy jawna4 = new PatrzacyMetodyInstancji();
        jawna4.patrzNa("kabanos");

        //podejście 2 - implementacja

        IPatrzacy wLocie4 = new IPatrzacy() {
            @Override
            public void patrzNa(String cos) {
                new Czlowiek().przygladajSie(cos);
            }
        };

        wLocie4.patrzNa("banana");

        //podejście 3 - lambda

        //można zdefiniować nowego człowieka, żeby nie wpisywać ciągle new Czlowiek, czyli:
        //Czlowiek jakisCzlowiek = new Czlowiek();

        IPatrzacy lambda4 = przedmiot -> new Czlowiek().przygladajSie(przedmiot);
        lambda4.patrzNa("jednorożec");


        //podejście 4 - referencja metody
        IPatrzacy methodRef4 = new Czlowiek()::przygladajSie;
        methodRef4.patrzNa("kaszanka");

        //podejście 5 - anonimowa instancja Człowiek

        //podejście 1 - jawna klasa
        IJedzacy jawna5 = new JedzacyMetodaStatyczna();
        jawna5.jedz(new Czlowiek(), "zioło-zioło");

        //podejście 2 - implementacja

        IJedzacy wLocie5 = new IJedzacy() {
            @Override
            public void jedz(IPotrafiacyJesc potrafiacyJesc, String cos) {
                new Czlowiek().jedz(cos);
            }
        };

        wLocie5.jedz(new Czlowiek(), "frytki");

        //podejście 3 - lambda

        IJedzacy lambda5 = (((potrafiacyJesc, cos) -> potrafiacyJesc.jedz(cos)));
        lambda5.jedz(new Czlowiek(), "burger");


        //podejście 4 - referencja metody
        IJedzacy methodRef5 = IPotrafiacyJesc::jedz;
        methodRef5.jedz(new Czlowiek(), "pizza");

    }
}
