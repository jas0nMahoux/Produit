package fr.jmahoux.app;

import java.time.Year;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();

        // Callback
        loginSystem.login(new LoginInterface() {

            @Override
            public void onSuccess() {
                System.out.println("Success!");
            }

            @Override
            public void onFailed() {
                System.out.println("Failed!");
            }
        });

        // Chaise
        // mai : 10
        // juin : 15
        // juillet : 32

        List<Produit> produits = Arrays.asList(
                new Produit("Chaise", 10),
                new Produit("Tabouret", 5),
                new Produit("Ampoule", 9),
                new Produit("Table", 100),
                new Produit("Lit", 300)
        );

        // Collections.sort(produits); // Trier dans l'ordre alphabétique

        produits.sort(new Comparator<Produit>() {
            @Override
            public int compare(Produit p1, Produit p2) {
                return Double.compare(p1.getPrix(), p2.getPrix());
            }
        });

        // produits.forEach(System.out::println);

        produits.forEach( p -> {
            System.out.println(p.getNom());
        });

        Produit testProduit = new Produit("Lenovo", 1400);
        testProduit.setPrix(1500);
        System.out.println("Les prix du produit en septembre 2023 sont de : " + testProduit.getPricesAt(Year.of(2023).atMonth(9)));

    }
}