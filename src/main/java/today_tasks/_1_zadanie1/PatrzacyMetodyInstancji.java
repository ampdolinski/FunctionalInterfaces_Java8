package today_tasks._1_zadanie1;

public class PatrzacyMetodyInstancji implements IPatrzacy{

    @Override
    public void patrzNa(String cos) {
        new Czlowiek().przygladajSie(cos);
    }
}
