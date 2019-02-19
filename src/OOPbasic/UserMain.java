package OOPbasic;

import controller.UserController;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserMain {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("Janusz","Kowalski","tojajanusz","pass123", "e@e.pl","55", LocalDate.of(2000,01, 13), LocalDateTime.now());
        uc.addUser("Grażyna","kowalska","tojagrazyna","pass123", "e@e.pl","55", LocalDate.of(2010,02, 01), LocalDateTime.now());
        uc.addUser("Brajan","Kowalski","brajanek","pass123", "e@e.pl","55", LocalDate.of(1988,03, 20), LocalDateTime.now());
        uc.addUser("Jesica","Kowalska","jessi","pass123", "e@e.pl","55", LocalDate.of(1960,04, 25), LocalDateTime.now());
        uc.getAllUser();
    }
}
