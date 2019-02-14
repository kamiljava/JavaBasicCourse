package jp;

import java.util.Random;

public class JP6 {
    public static void main(String[] args) {
//losowanie cyfr
        Random ran = new Random();
        int x = ran.nextInt(10) + 1;
        System.out.println("x = " + x);
        int y = ran.nextInt(10)+ 1;
        System.out.println("y = " + y);

        System.out.println(x>y);
        System.out.println((x*2)>y);
        System.out.println(y > x + 3 && y > x -2);
        System.out.println((x * y) % 2 == 0);





    }
}
