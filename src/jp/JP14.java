package jp;

public class JP14 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 9, 3, 7, 8, 8, 9, 9, 1, 1, 2, 3, 4, 5};
        int suma = 20;
        int licznik;

        for (licznik = 1; licznik < numbers.length; licznik++) {
            System.out.println("(" + numbers[licznik - 1] + ")+(" + numbers[licznik] + ")=(" + (numbers[licznik - 1] + numbers[licznik]) + ")");
            if (numbers[licznik - 1] + numbers[licznik] < suma) {
                suma = (numbers[licznik - 1] + numbers[licznik]);
            }
        }
        System.out.println("Najmniejsza suma to : " + suma);
    }
}
