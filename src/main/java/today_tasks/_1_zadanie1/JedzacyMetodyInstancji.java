package today_tasks._1_zadanie1;

public class JedzacyMetodyInstancji implements IJedzacy {
    @Override
    public void jedz(IPotrafiacyJesc potrafiacyJesc, String cos) {
        potrafiacyJesc.jedz(cos);
    }
}
