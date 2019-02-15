package jp;

public class JP13 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9, 2};
        int szukana = 2;
        int licznik = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == szukana) {
                licznik++;
            }

        }
        System.out.println(szukana + " występuje " + licznik + " razy ");
        int suma_mniejsze = 0;
        int suma_większe = 0;
        for (int k : numbers) {
            if (k > szukana) {
                suma_większe += k;

            } else if (k < szukana) {
                suma_mniejsze += k;
            }
        }
        int max_value = numbers[0];
        int max_value2= numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max_value) {
                max_value = numbers[i];
                index = i;
            }
        }

        for (int i = 0; i< numbers.length; i++){
            if(numbers[i] > max_value2 && index != i){
                max_value2 = numbers[i];
            }
        }
        System.out.println(max_value);
        System.out.println(max_value2);
        System.out.println(max_value*max_value2);
        int sum = 0;
        for (int element : numbers){
            sum = sum + element;
            }
            System.out.println(((double)sum)/numbers.length);
        }

    }
