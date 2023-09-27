package fr.jmahoux.app;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Produit {

    private String nom;

    private int prix;

    private ArrayList<HistoriquePrice> historiquePrice = new ArrayList<>();

    public Produit(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
        this.historiquePrice.add(new HistoriquePrice(prix, YearMonth.now()));
    }

    public List<Integer> getPriceAt(YearMonth yearMonth) {
        return this.historiquePrice.stream().filter(
                h -> h.getDate().equals(yearMonth)
            ).map(
                HistoriquePrice::getPrix
        ).toList();
    }
}
