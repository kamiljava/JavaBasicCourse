package start;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        //1. instrukcje warunkowe
        //if
        //switch case
        //2.Pętle
        //for
        //for each
        //while
        //do while
        //3.Tablice

        //deklaracje tablicy liczb calkowitych o wuymiarze 10 elementow

        int numtab[] = new int[10];
        // uzytkownik w petli  przypisal wartosci do wszystkich komorek
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numtab.length; i++) {
            System.out.println("Podaj " + i + " element tablicy");
            numtab[i] = sc.nextInt();
        }
        for (int element : numtab) {
            System.out.print(element + " ");
        }
        // w pętli while  wypisz tylko parzyste wartosci z tablicy
        System.out.print("\nElementy parzyste ");
        int i = 0;
        while (i < numtab.length) {
            if ((numtab[i] % 2 == 0) && numtab[i] != 0) {
                System.out.print(numtab[i] + " ");
            }
            i++;
        }
        //oblicz wartosc maksymalna w tablicy
        int maxVal = numtab[0];
        for (int element : numtab) {
            if (element > maxVal) {
                maxVal = element;
            }
            //maxVal = element> maxVal ? element : maxVal;     //lub to
        }
        System.out.println("\nMAX VAL: " + maxVal);
        //oblicz srednia artmetryczna wszystkich elementow tablicy
        int sum = 0;
        for (int element : numtab) {
            sum = sum + element;
        }
        System.out.println("AVG: " + (double)sum/numtab.length);
    }
}
