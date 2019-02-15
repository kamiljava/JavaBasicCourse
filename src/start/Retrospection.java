package start;

import java.util.Scanner;

public class Retrospection {

    public static void main(String[] args) {
        byte age = 18;
        double salary = 500.99;
        char sign = 'T';
        boolean flag = true;

        System.out.println(sign + 1);
        System.out.println((char)(sign + 1));

        System.out.printf("%d | %.2f | %c | %s \n", age, salary, sign, flag);
        System.out.println("Hello World!");
        // () ? () : ()
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rok urodzenia");
//        int age_scanner = scanner.nextInt();
//        String decision = (2019 - age_scanner) >= 18 ? "pełnoletnia" : "małolat";
//        System.out.println(decision);
//        System.out.println("Podaj staż pracy");
//        scanner.useLocale(Locale.US);
//        double staz = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Podaj imię");
//        String name = scanner.nextLine();
//
//        System.out.println("Twój staż: " + staz);
//        System.out.println("Twój imię: " + name);

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
