package jp;

import java.util.Scanner;

public class JP19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj amplitude");
        int amplituda = sc.nextInt();
        for (double i = 0; i < 6; i += 0.1) {
            int ilosc = (int) (Math.sin(i) * amplituda);
            if (ilosc >= 0) {
                for (int j = 0; j < ilosc; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j > ilosc; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
