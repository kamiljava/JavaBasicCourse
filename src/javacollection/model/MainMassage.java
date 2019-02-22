package javacollection.model;

import javacollection.controller.MessageController;

import java.util.Scanner;

public class MainMassage {


    public static void main(String[] args) {


        MessageController mc = new MessageController();
        int decision = -1;
        while (decision != 0) {
            System.out.println("Twoja poczta głosowa");
            System.out.println("Masz " + mc.messages.size() + " nowych wiadomosci");
            System.out.println("1.Odczytaj wiadomość \n2.Usuń wiadomość \n3.Dodaj wiadomosci\n0.Wyjść");
            Scanner sc = new Scanner(System.in);
            decision = sc.nextInt();
            sc.nextLine();
            switch (decision) {
                case 1:
                    mc.getMessage();
                    break;
                case 2:
                    mc.deleteMessage();
                    break;
                case 3:
                    System.out.println("Podaj adresata: ");
                    String author = sc.nextLine();
                    System.out.println("Podaj treść wiadomosci ");
                    String content = sc.nextLine();
                    mc.addMassage(author,content);
                    System.out.println("Zapisano wiadomosc ");

                    break;
                case 0:
                    System.out.println("Dziękuje");
                    break;
            }
        }

    }
}
