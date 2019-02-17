package jp;

public class JP16 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 3, 1, 5, 6, 7, 1, 9};
        int najmniejszaSuma = 20;
        int licznik1;
        int licznik2;
        int suma = 20;

        for (licznik1 = 0; licznik1 < numbers.length; licznik1++) {
            for (licznik2 = 0; licznik2 < numbers.length; licznik2++) {
                if (licznik1 != licznik2) {
                    suma = (numbers[licznik1]) + (numbers[licznik2]);

                }
                if (suma < najmniejszaSuma) {
                    najmniejszaSuma = suma;
                }
            }
        }
        System.out.println("Najmniejsza suma to: " + najmniejszaSuma);
    }

}
