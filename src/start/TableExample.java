package start;

public class TableExample {
    public static void main(String[] args) {
        double signal[] = {0.5,0.11,0.43,0.67,0.01,0.001};
        //inicjalizacja zmiennej pomocniczrj; warunek zatrzymania pętli; krok
        for(int i = 0; i <signal.length; i++)
            System.out.println(signal[i]);

        //pętla for each   komorka tablicy : tablica
        for(double s : signal){
            System.out.println(s);
        }
        //petla do 10000
        //for(int i = 0; i < 10000; i++){
        //    System.out.print(i +" ");
        //}

        //wypisanie
        System.out.println(signal[0]);
        System.out.println(signal[1]);
        System.out.println(signal[2]);
        System.out.println(signal[3]);
        System.out.println(signal[4]);
        System.out.println(signal[5]);
        //modyfikacja
        signal[4] = 0;
        System.out.println(signal[0]);
        System.out.println(signal[1]);
        System.out.println(signal[2]);
        System.out.println(signal[3]);
        System.out.println(signal[4]);
        System.out.println(signal[5]);
        //dlugosc tablicy
        System.out.println("Długosc sygnalu: " + signal.length);
        String name[] = new String[150];
        System.out.println("Długosc imiona: " + name.length);
        name [5] = "Michał";
        System.out.println(name[5]);
        System.out.println(name[2]); //null

    }

}
