package javacollection.controller;

import javacollection.model.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoController {

        private List<Auto> ordered_autos = new ArrayList<>();

        public void addAuto(String vinNumber,String brand,String model, double priceBasic){
            Auto a = new Auto(vinNumber,brand,model,priceBasic);
            ordered_autos.add(a);
            System.out.println("Zamowienie przyjęte! " + a);
        }
    public void getAllAutos(){
            ordered_autos.forEach(auto -> System.out.println(auto));
    }


}
