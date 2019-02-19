package OOPbasic;

import controller.UserController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UserMain {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("Janusz","Kowalski","tojajanusz","pass123", "eeee@e.pl","222355", LocalDate.of(2000,01, 13), LocalDateTime.now());
        uc.addUser("Grażyna","kowalska","tojagrazyna","pass123", "gg@e.pl","6665", LocalDate.of(2010,02, 01), LocalDateTime.now());
        uc.addUser("Brajan","Kowalski","brajanek","pass123", "vvv@e.pl","566675", LocalDate.of(1988,03, 20), LocalDateTime.now());
        uc.addUser("Jesica","Kowalska","jessi","pass123", "nnn@e.pl","88855", LocalDate.of(1965,04, 25), LocalDateTime.now());
        uc.addUser("Jesica","Kowalska","jessi","pass123", "nnn@e.pl","88855", LocalDate.of(1920,05, 25), LocalDateTime.now());

        uc.getAllUser();
        System.out.println("Test Date");
        System.out.println("User pierwszy: " + uc.birthDateComparator(0,1) );
        System.out.println("User drugi: " + uc.birthDateComparator(1,2) );

        System.out.println("Posortowane po dacie: DESC");
        uc.sortByDate();
        uc.getAllUser();
    }
}
