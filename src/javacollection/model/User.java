package javacollection.model;

import java.time.LocalDateTime;

public class User {
    private String login, password ;
    private LocalDateTime dateTime;


    public User (String login , String password){

        this.login = login;
        this.password = password;
        dateTime = LocalDateTime.now();
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }





}
