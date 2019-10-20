package today_tasks._5_zadanie5_predicate_cd;

import java.time.LocalDate;

public class DataKontrolna {

    private LocalDate dataKontrolna;

    public DataKontrolna(LocalDate dataKontrolna) {
        this.dataKontrolna = dataKontrolna;
    }

    public LocalDate getDataKontrolna() {
        return dataKontrolna;
    }

    public void setDataKontrolna(LocalDate dataKontrolna) {
        this.dataKontrolna = dataKontrolna;
    }
}
