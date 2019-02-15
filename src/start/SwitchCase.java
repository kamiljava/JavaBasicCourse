package start;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Co chcesz zrobić :\n (1) Zadanie1 \n (2) Zadanie2 \n (3) Zadanie3 \n (0) Wyjście");
        //klucz do instrukcji switch case
        int key = scanner.nextInt();

        switch (key){
            case 1:
                System.out.println("Rozwiązanie zadania 1");
                break;
            case 2:
            case 5: // można miec dwie opcje
                System.out.println("Rozwiązanie zadania 2");
                break;
            case 3:
                System.out.println("Rozwiązanie zadania 3");
                break;
            case 0:
                System.out.println("Wyjście");
                break;
            default:
                System.out.println("Zły wybór!");
        }
    }

}
