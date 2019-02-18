import controller.CarController;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AUTO FACTORY");
        boolean flag = true;
        //utwprzenie obiektu kontroler
        CarController cc = new CarController();

        while (flag) {

            System.out.println(" 1.Zamówienie auta\n 2.Lista zamowień\n 0.Wyjście");
            int decision = sc.nextInt();
            sc.nextLine();

            switch (decision) {
                case 1:
                    System.out.println("Podaj markę");
                    String brand = sc.nextLine();
                    System.out.println("Podaj model");
                    String model = sc.nextLine();
                    System.out.println("Podaj cene");
                    double price = sc.nextDouble();
                    System.out.println("Podaj rok");
                    int year = sc.nextInt();
                    cc.purchaseCar(brand, model, price, year);
                    break;
                case 2:
                    cc.getCars();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Błędny wybór");
            }
        }
    }
}
