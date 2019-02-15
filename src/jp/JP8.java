package jp;

import java.util.Scanner;

public class JP8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj staż pracy :\n (1) Junior 0-5 lat \n (2) Regular 5-10 lat \n (3) Senior wiecej niz 10 lat \n (0) Wyjście");
        int empl_fell = scanner.nextInt();
        if(empl_fell >= 0 && empl_fell < 5){
           System.out.println("Junior");
       }else if(empl_fell >= 5 && empl_fell < 10){
           System.out.println("Regular");
       } else {
           System.out.println("Senior");
       }
        switch (empl_fell){
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Junior");
                break;
            case 5: case 6: case 7: case 8: case 9:
                System.out.println("Regular");
                break;
            default:
                System.out.println("Senior");
        }
        scanner.close();
    }

}
