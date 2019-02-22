package javacollection.controller;

import javacollection.model.City;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityController {
    private static Integer id = 0;
    private Map<Integer, List> cityTable = new HashMap<>();

    public boolean insertIntoCity(String name, Double population, double area) {

        //Tworzymy obiekt klasy city - tworzymy rekord do bazy
        City c = new City(name, population, area);
        //zapisac obiekt w mapie o danym id - zapis w tabelce
        cityTable.put(++id, c.getCity());
        System.out.println("Dodano rekord: " + c);
        return true;
    }

    //Wypisanie
    public void selectFromCity() {
        cityTable.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    public void selectFromCityById(Integer id) {
        if (cityTable.get(id) != null) {
            System.out.println("Wyszukano:" + cityTable.get(id) + " o numerze id: " + id);
        } else {
            System.out.println("Brak rekordu o id = " + id);
        }
    }

    public boolean deleteCityById(Integer id) {
        if (cityTable.get(id) != null) {
            System.out.println("Wyszukano:" + cityTable.get(id) + " o numerze id: " + id);
            System.out.println("Usuniecie Miasta o numerze id: " + id + cityTable.remove(id));
            return true;
        } else {
            System.out.println("Brak rekordu o id = " + id);
        }
        return false;
    }

    public void saveFile() throws IOException {
        FileWriter fw = new FileWriter("DataBase.txt");
        for (Map.Entry<Integer, List> rekord : cityTable.entrySet()) {
            fw.write("\n" + rekord.toString() + "\n");

        }
        fw.close();
    }


}