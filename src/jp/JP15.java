package jp;

public class JP15 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 4, 1, 1, 1, 8, 9};
        int[] ciagi = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int licznik;
        int key = 0;

        for (licznik = 0; licznik < numbers.length; licznik++) {
            key = numbers[licznik];
            switch (key) {
                case 1:
                    ciagi[0]++;
                    break;
                case 2:
                    ciagi[1]++;
                    break;
                case 3:
                    ciagi[2]++;
                    break;
                case 4:
                    ciagi[3]++;
                    break;
                case 5:
                    ciagi[4]++;
                    break;
                case 6:
                    ciagi[5]++;
                    break;
                case 7:
                    ciagi[6]++;
                    break;
                case 8:
                    ciagi[7]++;
                    break;
                case 9:
                    ciagi[8]++;
                    break;
            }

        }
        for (licznik = 0; licznik < numbers.length; licznik++) {
            if (ciagi[licznik] > 1) {
                System.out.println("Liczba " + (licznik + 1) + " wykryto " + (ciagi[licznik]) + " razy.");
            }
        }
    }
}
