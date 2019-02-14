package jp;

public class JP2 {

    public static void main(String[] args) {
        //Declaracje
        String name, lastname, position ;
        final String PESEL;
        char gender;
        double salary_net;
        boolean isRetired;
        //przypisanie
        name = "Janusz";
        lastname = "Kowalski";
        position = "Bezrobotny";
        PESEL = "888888888";
        gender = 'M';
        salary_net = 10000;
        isRetired = false;

        System.out.printf("%s | %10s | %10s | %12s | %2s | %8.2fzl | %b", name,lastname,position,PESEL,gender,salary_net,isRetired);





    }
}
