package jp;

public class JP9 {
    public static void main(String[] args) {

        double number = 1.333;
        boolean isNormalized = true;
        if( number > 1 || number < 0) {
            isNormalized = false;
        }
        System.out.println(isNormalized);


    }
}
