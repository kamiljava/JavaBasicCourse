package javacollection;

import javacollection.controller.UserController;

public class MainUsers {

    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("Janusz","11");
        uc.addUser("Kamil","22");
        uc.addUser("Karol","33");
        uc.addUser("Michał","44");
        uc.addUser("Janusz","22");
        uc.deleteUser("Karol");
        uc.deleteUser("Grażyna");
        uc.showUsers();
        uc.changePassword("Kamil","22","88","88");
        uc.changePassword("Andrzej","22","88","88");
        uc.showUsers();

    }
}
