package algorithms;
// Napisz program OOP implementujący następujące funkcje:
// Potęgowanie liczb całkowitych
// Silnię z podanej liczby
// Ciąg geometryczny
// Ciąg arytmetyczny
// Nie wykorzystuj biblioteki matematycznej.
// Dodaj do tego programu tekstowy interfejs użytkownika umożliwiający wprowadzanie danych oraz ich poprawną walidację.


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Algorithms1 {
    //Potęgowanie
    public int power(int x, int y) {

        //2
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * x;
        }
        return result;
    }

    //Silnia
    public int strong() {
        int silnia = 4;
        int result2 = 1;
        for (int i = 1; i <= silnia; i++) {
            result2 = result2 * i;
        }


        return result2;
    }

    public int geometricString() {
        int geo = 5;
        int result3 = 1;
        for (int i = 1; i <= geo; i++) {
            result3 = geo * (result3);
        }
        return result3;
    }

    public int algSequence(int a0, int r, int n) {
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum = sum + (a0 + i * r);
        }
        return sum;
    }

    // Napisz program, który sprawdzi czy podana liczba jest liczbą doskonałą:
// Liczba doskonała to taka liczba naturalna, której suma jej dzielników właściwych (bez niej samej) jest jej równa.
    public boolean perfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return num == sum ? true : false;
    }

    //Napisz program, który implementuje algorytm Euklidesa (NWD) dla zadanych dwóch liczb dziesiętnych.
    public int getNWD(int x, int y) {
        //sprawdzanie wiekszej i mniejszej
        int less = x;
        int greather = y;
        if (x > y) {
            less = y;
            greather = x;
        }
        //Iterujemy w petli i sprawdzany czy dzielnik less jest tez dzielnikiem greather
        for (int i = less; less > 1; i--) {
            if (less % i == 0 && greather % i == 0) {
                return i;
            }
        }
        return 1;

    }
//Napisz program, który konwertuje liczbę zapisaną w systemie dziesiętnym na system dwójkowy i odwrotnie.

    public String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal >= 1) {
            binary = binary.concat(String.valueOf(decimal % 2));
            decimal = decimal / 2;
        }
        //odwrocenie liczby
        //StringBuffer pozwala na modyfikacje zawartosci tablicy Stringow
        StringBuffer sb = new StringBuffer(binary);
        //revers pdwrocenie i rzutowanie na stringa
        return sb.reverse().toString();
        //krotsza wersja
        //return new StringBuffer(binary).reverse().toString();
    }

    public int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal + (((int) binary.charAt(i) - 48) * power(2, (binary.length() - 1) - i));
        }
        return decimal;
    }

    //Napisz program, który wypisze n-liczb pierwszych.
//Napisz program, która sprawdzi czy podana liczba jest liczbą pierwszą.
    public boolean isPrimary(int number) {
        int counter = 0;
        //inicjalizacja licznika podzielnikow
        //w pętli for zliczamy wszystkie liczby naturalne do liczby number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        //kazdorazowo sprawdzając w instrukcji if czy te liczby sa dzielnikami number
        //tak- licznik ++
        //nie - nie
        return counter == 0 && number != 1 ? true : false;
        //zwracamy true jezeli licznik == 0; : false jezeli licznik >0
    }

    public void getPrimaryNumbers(int n) {
        //inicjalizacja licznika zliczen
        int counter = 0;
        int i =2;
        LocalTime lt_start =LocalTime.now();
        //petla while
        //instrukcja if sprawdza czy aktualna liczba jest liczba pierwsza
        //jezeli tak to wypisujemy i zwiekszamy licznik
        System.out.println("Liczby pierwsze to: ");
        while (counter<n){
            if (isPrimary(i)){
                counter++;
                System.out.print(i + " ");
            }
            i++;
        }
        //liczenie czasu
        LocalTime lt_stop = LocalTime.now();
        Duration time_interval = Duration.between(lt_start,lt_stop);
        System.out.println("\n Czas wykonania: " + time_interval);

    }

    public static void main(String[] args) {
        Algorithms1 a1 = new Algorithms1();
        System.out.println("Wynik z potęgowania wynosi : " + a1.power(2, 3));
        System.out.println("Silnia wynosi : " + a1.strong());
        System.out.println("Ciąg geometryczny wynosi : " + a1.geometricString());
        System.out.println("Ciąg artmetyczny wynosi : " + a1.algSequence(2, 2, 4));
        System.out.println("Czy liczba jest doskonałą : " + a1.perfectNumber(11));
        System.out.println("Czy liczba jest doskonałą : " + a1.perfectNumber(28));
        System.out.println("NWD: " + a1.getNWD(12, 9));
        System.out.println("NWD: " + a1.getNWD(11, 13));
        System.out.println("Decymalny na binarny " + a1.decimalToBinary(12));
        System.out.println("Binarny na decymalny " + a1.binaryToDecimal("1100"));
        System.out.println("Czy liczba jest liczbą pierwszą: " + a1.isPrimary(13));
        System.out.println("Czy liczba jest liczbą pierwszą: " + a1.isPrimary(15));
        System.out.println("Czy liczba jest liczbą pierwszą: " + a1.isPrimary(2111));
        a1.getPrimaryNumbers(100); //ilosc liczb pierwszych ktore chcemy zobaczyc


    }
}
