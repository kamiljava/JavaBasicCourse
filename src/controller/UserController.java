package controller;

import OOPbasic.model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserController {
    User users[] = new User[100];
    int index;

    public void addUser(String name, String lastname, String login, String password, String email, String phone, LocalDate birth_date, LocalDateTime registration_date_time) {
        User u = new User(name, lastname, login, password, email, phone, birth_date, registration_date_time);
        //dodawanie godziny+ do czasu aktualnego
        u.setRegistration_date_time(u.getRegistration_date_time().plusHours(1));
        //
        users[index] = u;
        index++;
    }

    public void getAllUser() {

        for (int i = 0; i < index; i++) {
            System.out.println(users[i]);
        }
    }
    //metoda porownujaca daty urodzenie dwoch uzytkownikow
    //jezeli pierwza dat jest <od drugiej--> true
    //w przeciwnym razie --> false

    public boolean birthDateComparator(User u1, User u2) {
        return u1.getBirth_date().isBefore(u2.getBirth_date());
    }

    public boolean birthDateComparator(int index1, int index2) {
        return users[index1].getBirth_date().isBefore(users[index2].getBirth_date());
    }

    public void sortByDate() {
        for (int j = 0; j < index; j++) {
            for (int i = 1; i < index; i++) {
                //sprawdzanie czy pierwszy jest mlodszy od pierwszego
                if (birthDateComparator(i - 1, i)) {

                    //tymczasowy element
                    User u1 = users[i - 1];
                    //tymczasowy element
                    User u2 = users[i];
                    //zamiana miejscami w komorkach tablicy
                    users[i - 1] = u2;
                    users[i] = u1;

                }
            }
        }

    }
}