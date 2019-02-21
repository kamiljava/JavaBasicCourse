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

        public  void addEguipment(String vin ,String name){
            for(int i = 0; i< ordered_autos.size(); i ++) {
                if (ordered_autos.get(i).getVinNumber().equals(vin)) {
                    ordered_autos.get(i).setEquigpmentOrderByName(name);
                }
            }
    }

}
