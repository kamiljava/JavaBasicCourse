package javacollection;

import javacollection.controller.AutoController;

public class MainAuto {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        ac.addAuto("233f2342f","Audi","A4",100000.0);
        ac.addAuto("ER3f2342f","Mercedes","C",200000.0);
        ac.addAuto("PL3f2342f","VW","Golf",40000.0);
        ac.addAuto("GL3f2342f","Volvo","V40",80000.0);
        ac.getAllAutos();
        ac.addEguipment("PL3f2342f", "ABS");
        ac.addEguipment("GL3f2342f", "Klimatyzacja");
        ac.getAllAutos();


    }
}
