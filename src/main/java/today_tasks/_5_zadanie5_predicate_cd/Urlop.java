package today_tasks._5_zadanie5_predicate_cd;

import java.time.LocalDate;

public class Urlop {

    private LocalDate dataOd;
    private LocalDate dataDo;

    public Urlop(LocalDate dataOd, LocalDate dataDo) {
        this.dataOd = dataOd;
        this.dataDo = dataDo;
    }

    public LocalDate getDataOd() {
        return dataOd;
    }

    public void setDataOd(LocalDate dataOd) {
        this.dataOd = dataOd;
    }

    public LocalDate getDataDo() {
        return dataDo;
    }

    public void setDataDo(LocalDate dataDo) {
        this.dataDo = dataDo;
    }

}
