package jp;

import java.util.Scanner;

public class JP11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int key = -1;
        while (key != 0) {
            System.out.println("Podaj promień");
            int r = scanner.nextInt();
            System.out.println("Co chcesz obliczyć: \n(1) Pole koła \n(2) Obwód koła \n(3) Powierzchnia sfery \n(0) Wyjście");
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.printf("Promień koła: %.2f \n", Math.PI * Math.pow(r, 2));
                    break;
                case 2:
                    System.out.printf("Obwód koła: %.2f \n", 2 * Math.PI * r);
                    break;
                case 3:
                    System.out.printf("Pole sfery: %.2f \n", (4 * Math.PI * Math.pow(r, 3) / 3));
                    break;
                case 0:
                    System.out.println("Wyjście");
                    break;
                default:
                    System.out.println("Błędny wybór!");
            }
            System.out.println("END");
        }
    }
}
