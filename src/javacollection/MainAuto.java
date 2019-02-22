package javacollection;

import algorithms.Main;
import javacollection.controller.AutoController;

import java.io.IOException;
import java.util.logging.Logger;



public class MainAuto {

    private static final Logger logo = Logger.getLogger(Main.class.getName() );
    public static void main(String[] args) throws IOException {
        AutoController ac = new AutoController();
        ac.addAuto("233f2342f","Audi","A4",100000.0);
        ac.addAuto("ER3f2342f","Mercedes","C",200000.0);
        ac.addAuto("PL3f2342f","VW","Golf",40000.0);
        ac.addAuto("GL3f2342f","Volvo","V40",80000.0);
        ac.addAuto("UL3f2342f","Kia","Ceed",60000.0);
        ac.addAuto("ML3f2342f","Toyota","jakas",70000.0);
        ac.getAllAutos();
        System.out.println();
        ac.addEguipment("233f2342f", "Klima");
        ac.addEguipment("PL3f2342f", "ABS");
        ac.addEguipment("ML3f2342f", "ABS");
        ac.addEguipment("GL3f2342f", "Klima");
        ac.addEguipment("UL3f2342f", "GPS");
        ac.addEguipment("UL3f2342f", "ABS");
        ac.getAllAutos();
        System.out.println();
        ac.removeOrder("GL3f2342ff");
        System.out.println();
        logo.info("Usunieto zamówienie"); //informacja na czerwono
        ac.removeOrder("GL3f2342f");
        ac.getAllAutos();
        logo.info("Usunieto wyposazenie auta"); //informacja na czerwono
        ac.removeEqipment("PL3f2342f", "ABS");
        ac.getAllAutos();
        ac.saveFile("Auto.txt");
    }
}
