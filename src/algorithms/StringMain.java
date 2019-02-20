package algorithms;

import algorithms.controller.StringController;

public class StringMain {

    public static void main(String[] args) {
        StringController sc = new StringController();
        System.out.println("Czy zawiera a: " + sc.isCharacter('a'));
        System.out.println("Czy zawiera y: " + sc.isCharacter('y'));
        System.out.println("Ilozc znaku i: " + sc.countAllCharacters('i'));
        System.out.println("Ilozc znaku a: " + sc.countAllCharacters('a'));
        System.out.println("Ilozc znaku b: " + sc.countAllCharacters('b'));
        System.out.println("Ilosc wielkich liter w tekscie: " + sc.countUpperCases());
        System.out.println("Odwrocony napis: " + sc.reverse());
    }
}
