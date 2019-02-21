package javacollection;

import javacollection.controller.BubbleController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBubble {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(4,6,2,8,9,4,1,7));
        BubbleController bc = new BubbleController();
        System.out.println("Sortowanie od najmniejszej: " + bc.sortASC(myList));
        System.out.println("Sortowanie od najwiekszej: " + bc.sortDESC(myList));

    }
}
