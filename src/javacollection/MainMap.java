package javacollection;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {

        Map<String, Double> eqPrice = new HashMap<>();
        //dodawanie do mapy
        eqPrice.put("Tapicerka skorzana ", 7000.0);
        eqPrice.put("Klima ", 2500.0);
        eqPrice.put("Automatyczna skrzynia biegów ", 10000.0);
        eqPrice.put("Lakier metalik ", 3000.0);
        //wypisanie elementow z listy
        System.out.println(eqPrice);
        //modyfikacja wartosci
        eqPrice.put("Lakier metalik ", 3500.0);
        System.out.println(eqPrice);
        //sprawdzenie wystepowania kluczy
        System.out.println(eqPrice.keySet());
        System.out.println(eqPrice.keySet().contains("Tapicerka skorzana ")); // sprawdzenie czy jest
        //sprawdzenie wartosci w mapie
        System.out.println(eqPrice.values());
        System.out.println("Czy cos kosztuje 7000? : " + eqPrice.values().contains(7000.0));
        // petla mapie
        for (Map.Entry<String, Double> eq : eqPrice.entrySet()) {
            System.out.println(eq.getKey() + " " + eq.getValue());
        }
        //usuniecie czegos z bazy danych
        eqPrice.remove("Klima ");
        System.out.println(eqPrice);
        //Sumowanie wartosci
        double sum = 0;
        for (Map.Entry<String, Double> eq : eqPrice.entrySet()) {
            // sum = sum + eq.getValue()
            sum += eq.getValue();
        }
        System.out.println("Suma za full opcje : " + sum);
    }
}