package javacollection.controller;

import javacollection.model.Auto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AutoController {

    private List<Auto> ordered_autos = new ArrayList<>();

    public void addAuto(String vinNumber, String brand, String model, double priceBasic) {
        Auto a = new Auto(vinNumber, brand, model, priceBasic);
        ordered_autos.add(a);
        System.out.println("Zamowienie przyjęte! " + a);
    }

    public void getAllAutos() {
        ordered_autos.forEach(auto -> System.out.println(auto));
    }

    public void addEguipment(String vin, String name) {
        for (int i = 0; i < ordered_autos.size(); i++) {
            if (ordered_autos.get(i).getVinNumber().equals(vin)) {
                ordered_autos.get(i).setEquigpmentOrderByName(name);
            }
        }
    }

    public boolean removeOrder(String vinNumber) {

        for (int i = 0; i < ordered_autos.size(); i++) {
            if (ordered_autos.get(i).getVinNumber().equals(vinNumber)) {
                System.out.println("Zamówienie zostało usunięte " + ordered_autos.get(i));
                System.out.println(); //kosmetyka
                ordered_autos.remove((ordered_autos.get(i)));
                return true;
            }
        }
        System.out.println("Nie usunięto! " + "Podany numer VIN " + vinNumber + " nie istnieje w bazie danych ");
        return false;
    }
    public void removeEqipment(String vin, String eq_name){
        for(int i = 0; i < ordered_autos.size(); i++){
            if(ordered_autos.get(i).getVinNumber().equals(vin)){
                System.out.println("Usunięto wyposażenie");
                ordered_autos.get(i).setEquigpmentOrderByName(eq_name);
            }
        }
    }
    //DODAWANIE ZAMOWIEN DO PLIKU      !!!!!!!!!!!!!!!!!!!!!!!!!!
    public void  saveFile (String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write("SPRZEDANE SAMOCHODY\n\n");
        for (Auto a:ordered_autos){
            fw.write(a.toString()+"\n");
        }
        fw.write("\nDATA: "+ LocalDate.now());
        fw.close();


    }

    }

