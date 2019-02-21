package javacollection.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Auto {

    private String vinNumber;
    private String brand, model;
    private double priceBasic;

    private List<String> equitmentName = new ArrayList<>(Arrays.asList("Klimatyzacja","ABS","GPS"));

    private List<Double> equitmentPrice = new ArrayList<>(Arrays.asList(2000.0,5000.0,1000.0));
    private List<Integer> equitmentOrder = new ArrayList<>(Arrays.asList(0,0,0));

    private List<List> equitment = new ArrayList<>(Arrays.asList(equitmentName, equitmentPrice, equitmentOrder));

    public Auto(String vinNumber, String brand, String model, double priceBasic) {
        this.vinNumber = vinNumber;
        this.brand = brand;
        this.model = model;
        this.priceBasic = priceBasic;
    }

    @Override
    public String toString() {
        return String.format("%10s | %10s | %10s | %15.2f | %10s | %15.2f" ,
                vinNumber, brand, model, priceBasic, getOrderEquitmentNames(),calcFullPrice());
    }
    public double calcFullPrice() {

        String equitmentNames2 = "";
        double priceFull = priceBasic;
        for (int i = 0; i < equitmentOrder.size(); i++) {
            if (equitmentOrder.get(i) != 0) {
                priceFull += equitmentPrice.get(i);
            }
        }
        return priceFull;
    }
    public String getOrderEquitmentNames(){
        String equitmentNames2 = "";
        for (int i = 0;i < equitmentName.size(); i++){
            if (equitmentOrder.get(i) != 0){
                equitmentNames2 += (equitmentName.get(i)+ ",");
            }
        }
        return equitmentNames2;
    }
    
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPriceBasic() {
        return priceBasic;
    }

    public void setPriceBasic(double priceBasic) {
        this.priceBasic = priceBasic;
    }
}
