package fr.jmahoux.app;

import java.time.YearMonth;

public class HistoriquePrice {

    private int prix;

    private YearMonth date;

    public HistoriquePrice(int prix, YearMonth date) {
        this.prix = prix;
        this.date = date;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public YearMonth getDate() {
        return date;
    }

    public void setDate(YearMonth date) {
        this.date = date;
    }
}
