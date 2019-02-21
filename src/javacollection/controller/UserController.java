package javacollection.controller;

import javacollection.model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserController {

    List<User> registered_user = new ArrayList<>();
    Set<String> registered_login = new HashSet<>();

    public boolean addUser(String login, String password) {
        if (registered_login.contains(login)) {
            System.out.println("Login " + login + " istnieje w bazie");
            return false;
        }
        User u = new User(login, password);
        registered_user.add(u);
        registered_login.add(login);
        System.out.println("Zarejestrowano użytkownika o loginie " + login);
        return true;
    }

    public void showUsers() {
        registered_user.forEach(user -> System.out.println(user));

    }

    public boolean deleteUser(String loginDelete) {

        for (int i = 0; i < registered_user.size(); i++) {
            if (registered_user.get(i).getLogin().equals(loginDelete)) {
                registered_user.remove(registered_user.get(i));
                registered_login.remove(loginDelete);
                System.out.println("Usunieto uzytkownika: " + loginDelete);
                return true;
            }

        }
        System.out.println("Nie ma takiego uzytkownia " + loginDelete);
        return false;
    }

    public boolean changePassword(String login, String oldPassword, String newPassword1, String newPassword2) {
        for (int i = 0; i < registered_user.size(); i++) {
            if (registered_user.get(i).getLogin().equals(login)) {
                if (newPassword1.equals(newPassword2) && !newPassword1.equals(oldPassword)) {
                    registered_user.get(i).setPassword(newPassword1);
                    System.out.println("Hasło użytkownika " + login + " zostało zmienione");
                    return true;
                }
                System.out.println("Zle podano dane");
                return false;
            }
        }
        System.out.println("Użytkownik: " + login + " nie istnieje lub podałeś złe hasło");
        return false;
    }
}
