package controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class DateTimeController {

    public int getAgeFromStringDate(String date) {
        LocalDate birthday = LocalDate.parse(date);
        LocalDate toDay = LocalDate.now();
        Period age = Period.between(birthday, toDay);
        System.out.println(age);
        System.out.println(birthday);
        return age.getYears();
    }

    public LocalDate dataComperator(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);

        return date1.isBefore(date2) ? date1 : date2;
    }

    public int monday(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);

        LocalDate lessDate = date1.isBefore(date2) ? date1 : date2;
        LocalDate greatherDate = date1.isAfter(date2) ? date1 : date2;
        //licznik poniedzialkowe
        int mondayCounter = 0;
        //inicjalizacja petli data mniejsza
        //warunkiem wykonania petli jest sprawdzenie czy data mniejsza nie przekroczyla daty wiekszej
        //dodaje 1 dzin
        for (LocalDate id = lessDate; id.isBefore(greatherDate); id = id.plusDays(1)) {
            if (id.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondayCounter++;
            }
        }

        return mondayCounter;
    }

    public void bornDay(String d) {
        LocalDate date = LocalDate.parse(d);
        DayOfWeek myDay = date.getDayOfWeek();
        System.out.println(date.getDayOfWeek());
        for (LocalDate id = date; id.isBefore(LocalDate.now()); id = id.plusYears(1))
        {
            if (id.getDayOfWeek() == myDay) {
                System.out.println("Rok w którym miałeś urodziny w tym samym dniu tygodnia co narodziny: " + id);
            }
        }

    }

    public static void main(String[] args) {
        DateTimeController dtc = new DateTimeController();
        System.out.println("Twój wiek dokładny to: " + dtc.getAgeFromStringDate("1988-01-13") + " lat");
        System.out.println("Wcześniejsza data jest: " + dtc.dataComperator("1988-01-01", "2010-01-01"));
        System.out.println("Wcześniejsza data jest: " + dtc.dataComperator("2010-01-01", "2000-01-01"));
        System.out.println("Liczba poniedzialkow miedzy datami: " + dtc.monday("1988-01-13", "2019-02-19"));
        dtc.bornDay("1988-01-13");
    }

}
