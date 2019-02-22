package javacollection;

import javacollection.controller.CityController;
import javacollection.model.City;

import java.io.IOException;

public class MainCity {
    public static void main(String[] args) throws IOException {
        CityController cc = new CityController();
        cc.insertIntoCity("Grudziadz", 95000.,59.1);
        cc.insertIntoCity("Bydgoszcz", 355000.,170.1);
        cc.insertIntoCity("Torun", 200000.,115.1);
        cc.selectFromCity();
        cc.selectFromCityById(2);
        cc.selectFromCityById(10);
        cc.deleteCityById(3);
        cc.selectFromCity();
        cc.saveFile();
    }
}
