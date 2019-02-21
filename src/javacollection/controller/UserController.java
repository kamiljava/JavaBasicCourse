package javacollection.controller;

import javacollection.model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserController {

    List<User> registered_user = new ArrayList<>();
    Set<String> registered_login = new HashSet<>();

    public boolean addUser(String login, String password){
        if (registered_login.contains(login)){
            System.out.println("Login " + login + " istnieje w bazie");
            return false;
        }
        User u = new User(login, password);
        registered_user.add(u);
        registered_login.add(login);
        System.out.println("Zarejestrowano użytkownika");
        return true;
    }

    public void showUsers(){
        registered_user.forEach(user -> System.out.println(user));


    }

}
