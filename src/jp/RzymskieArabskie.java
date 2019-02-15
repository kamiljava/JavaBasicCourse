package jp;

import java.util.Scanner;

public class RzymskieArabskie {

    // tablica liczb rzymskich (podstawowe + dozwolone)
    private static String[] rzymskie = {"M", "CM", "D", "CD", "C","XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    // tablica odpowiadających im liczb arabskich
    private static int[] arabskie   = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    // metoda sprawdza czy podana liczba rzymska jest poprawna
    public static boolean czyPoprawnaRzymska(String liczba) {

        // konwertujemy liczbę na duże znaki (takie mamy w tablicy)
        liczba = liczba.toUpperCase();

        // jeśli liczba jest pusta zwracamy fałsz
        if (liczba.length() == 0) return false;
        // jeśli wartość tego co dostajemy od użytkownika z tym co
        // sami obliczymy (zamiana na arabską i ponowna na rzymską) jest różna zwracamy fałsz
        if (!liczba.equals(naRzymska(naArabska(liczba)))) return false;
        // w każdym innym przypadku zwracamy prawdę
        return true;
    }

    // metoda sprawdza czy podana liczba arabska jest poprawna
    public static boolean czyPoprawnaArabska(int liczba) {
        // sprawdzamy zakres
        if (liczba < 1 || liczba > 3999) return false;
            // jeśli w porządku zwracamy prawdę
        else return true;
    }

    // metoda zamienia liczbę arabską na rzymską
    public static String naRzymska(int liczba) {

        // zmienna wyjście będzie zawierała liczbę rzymską
        String wyjscie = "";

        // sprawdzamy w pętli naszą liczbę z poszczególnymi
        // elementami tablicy liczb arabskich
        for (int i = 0; i < arabskie.length; i++) {
            // dopóki liczba jest większa
            while (liczba >= arabskie[i]) {
                // tworzymy liczbę rzymską dodając odpowiedną wartość z tablicy rzymskie
                wyjscie += rzymskie[i];
                // zmniejszamy liczbę arabską o odpowiednią wartość
                liczba -= arabskie[i];
            }
        }
        // zwracamy liczbę rzymską (łańcuch tekstowy)
        return wyjscie;
    }

    // meoda zamienia liczbę rzymską na arabską
    public static int naArabska(String liczba) {

        // konwertujemy liczbę na duże znaki (takie mamy w tablicy)
        liczba = liczba.toUpperCase();

        // zmienna wyjście będzie zawierała liczbę arabską
        int wyjscie = 0;

        // zmienna index umożliwi nam przemieszczanie się po liczbie rzymskiej
        int index = 0;

        // sprawdzamy w pętli naszą liczbę z poszczególnymi
        // elementami tablicy liczb rzymskich
        for (int i = 0; i < rzymskie.length; i++) {
            // dopóki liczba zaczyna się z odpowiednią liczbą rzymską
            while (liczba.startsWith(rzymskie[i], index)) {
                // tworzymy liczbę arabską dodając odpowiedną wartość z tablicy arabskie
                wyjscie += arabskie[i];
                // przechodzimy do następnej pozycji w liczbie rzymskiej
                index += rzymskie[i].length();
            }
        }
        // zwracamy liczbę arabską
        return wyjscie;
    }


    public static void main (String[] args) {

        Scanner wejscie = new Scanner(System.in);

        System.out.print ("Podaj liczbę z zakresu (1-3999) w systemie rzymskim: ");

        // pobieramy od użytkownika łańcuch tekstowy (liczbę rzymską)
        String rzymska = wejscie.nextLine();

        // sprawdzamy poprawność i wyświetlamy wynik konwersji lub komunikat o błędzie
        if(czyPoprawnaRzymska(rzymska)) {
            System.out.println ("Liczba zapisana w systemie arabskim: " + naArabska(rzymska));
        } else {
            System.out.println ("Niepoprawna liczba.");
        }

        System.out.print ("Podaj liczbę z zakresu (1-3999) w systemie arabskim: ");

        // pobieramy od użytkownika liczbę (liczbę arabska)
        int arabska = wejscie.nextInt();

        // sprawdzamy poprawność i wyświetlamy wynik konwersji lub komunikat o błędzie
        if(czyPoprawnaArabska(arabska)) {
            System.out.println ("Liczba zapisana w systemie rzymskim: " + naRzymska(arabska));
        } else {
            System.out.println ("Niepoprawna liczba.");
        }
    }
}
