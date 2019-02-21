package javacollection;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Kolekcje");
        //utworzenie listy
        List<String> fruits = new ArrayList<>();
        //utworzenie pustej liczby owocow
        System.out.println("Rozmiar listy: " + fruits.size());
        //dodawanie do listy
        fruits.add("Jabłko");
        fruits.add("Ananas");
        fruits.add("Wiśnia");
        fruits.add("Banan");
        fruits.add("Pomarańcza");
        fruits.add("Mandarynka");
        //wkladanie elementu do tablicy(na konkretnym indexie), przesuwa inne elementy
        fruits.add(1, "Mango");
        //wypisanie zawartości tablicy
        System.out.println(fruits);
        //wyrazenie lambda , krotka wersja petli for each
        fruits.forEach(f -> System.out.println(f));
        //for each po staremu
        for (String f : fruits) {
            System.out.println(f);
        }
        //modyfikacja wartosci w liscie
        fruits.set(1, "Kaka");
        //odczytanie wartosci na podanym indexie
        System.out.println(fruits.get(1));
        System.out.println(fruits);

        //usuwanie wartosci
        fruits.remove("Banan");
        System.out.println(fruits);
        //uuwanie po indexie
        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        //inicjalizacja listy wartosciami początkowymi

        List<String> brand = new ArrayList<>(Arrays.asList("BMW", "Audi", "Mercedes", "VW", "Kia"));
        brand.add("Porsche");
        System.out.println(brand);

    }}
