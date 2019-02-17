package jp;

public class JP17 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 9, 9, 5, 6, 7, 9, 9, 2};
        double srednia;
        int suma = 0;
        int licznik;
        int ilosc_ponizej_sredniej = 0;

        for (licznik = 0; licznik < numbers.length; licznik++) {
            suma = suma + numbers[licznik];
        }
        srednia = (double) suma / (double) (numbers.length);
        System.out.println(suma + "/" + numbers.length + "=" + srednia);
        for (licznik = 0; licznik < numbers.length; licznik++) {
            if (numbers[licznik] < srednia) {
                ilosc_ponizej_sredniej++;
            }
        }
        System.out.println("Ilosc ponizej sredniej " + ilosc_ponizej_sredniej);

    }

}
