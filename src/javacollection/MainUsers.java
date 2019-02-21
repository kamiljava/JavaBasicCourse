package javacollection;

import javacollection.controller.UserController;

public class MainUsers {

    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("Janusz","11");
        uc.addUser("bb","22");
        uc.addUser("nn","33");
        uc.addUser("dd","44");
        uc.addUser("Janusz","22");


    }
}
