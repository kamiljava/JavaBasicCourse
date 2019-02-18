package OOPbasic;

import OOPbasic.model.Auto;
import jdk.nashorn.internal.objects.annotations.Getter;

public class Main {

    public static void main(String[] args) {

        //utworzenie obiektu klasy

       // Auto a1 = new Auto();
       // //odwolanie do pol klasowych --> obiekt.pole
       //// System.out.println("Brand: " + a1.brand);
       //// System.out.println("Model: " + a1.model);
       //// System.out.println("Production: " + a1.year);
       //// System.out.println("Color: " + a1.color);
       //// System.out.println("Fuel: " + a1.fuel_type);
       //// System.out.println("Price: " + a1.price);
       //// System.out.println("Segment: " + a1.segment);
       // System.out.println(a1);
       // //zmiana pol klasowych
       // a1.brand = "BMW";
       // a1.model = "X5";
       // a1.year = 2010;
       // a1.color = "BLACK";
       // a1.fuel_type = "DIESEL";
       // a1.price = 80_000;
       // a1.segment = 'S';
//
       ////System.out.println("Brand: " + a1.brand);
       ////System.out.println("Model: " + a1.model);
       ////System.out.println("Production: " + a1.year);
       ////System.out.println("Color: " + a1.color);
       ////System.out.println("Fuel: " + a1.fuel_type);
       ////System.out.println("Price: " + a1.price);
       ////System.out.println("Segment: " + a1.segment);
//
       // System.out.println(a1);
//
       // Auto a2 = new Auto();
//
       // System.out.println(a2);
//
       // a2.setPrice(100000);
       // System.out.println(a2);
       // System.out.println(a2.getPrice());
       // System.out.println(a2.getPriceTax(23));
       // System.out.println(a1.getPriceTax(23));
        Auto a3 = new Auto("VW","Passat", 2018, "Silver", "diesiel" ,
                150000,'D');
        System.out.println(a3);
        System.out.println("Cena brutto: " + a3.getPriceTax(23));
        Auto a4 = new Auto("Audi", "A4", 2010 ,"Red",
                "Diesel", 50000, 'A');
        System.out.println(a4);
        System.out.println("Cena brutto: " + a4.getPriceTax(23));
    }
}
