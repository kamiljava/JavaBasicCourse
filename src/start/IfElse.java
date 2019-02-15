package start;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok urodzenia");
        int year = scanner.nextInt();
        scanner.nextLine();
        // -IF1-----------------------------------------------------------
        if(year < 0 || year > 2019 ){
            System.out.println("Błędne dane!");
        } else {
            // -IF2--------------------------------------------------------
            if ((2019 - year) >= 18) {
                System.out.println("Logowanie: podaj login i hasło!");
                String login = scanner.nextLine();
                String password = scanner.nextLine();
                // -IF3--------------------------------------------------
                if(login.equals("admin") && password.equals("admin")){
                    System.out.println("Witaj adminie");
                } else if (login.equals("user") && password.equals("user")){
                    System.out.println("Witaj userze");
                } else {
                    System.out.println("Błąd logowania!");
                }
                // -----------------------------------------------------
            } else {
                System.out.println("Niepełnoletni");
            }
            // ----------------------------------------------------------
        }
        // ---------------------------------------------------------
        scanner.close();
    }
}
