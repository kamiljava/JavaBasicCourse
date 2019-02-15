package jp;

public class JP12 {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9, 2};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (i != 2) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (i <= 1) {
                System.out.print(numbers[i] + " ");
            }

        }
        System.out.println();
        boolean flag = false;
        int szukane = 11;
        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(i);
            if (numbers[i] == szukane) {
                flag = !flag;
                System.out.println(i + " " + numbers[i] + " ");
                //break;
            }
        }
        if (!flag) {
            System.out.println("Nie znaleziono zadnej wartosci");
        }
    }

}

