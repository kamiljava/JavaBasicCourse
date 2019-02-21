package javacollection;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        //deklaracja zbioru
        Set<String> pesel = new HashSet<>();
        Set<String> peseleBydgoszcz = new HashSet<>(Arrays.asList("6666", "7777", "8888", "2222"));
        //dodawanie wartosci do zbioru
        System.out.println("Czy dodano? " + pesel.add("1111"));
        System.out.println("Czy dodano? " + pesel.add("2222"));
        System.out.println("Czy dodano? " + pesel.add("3333"));
        System.out.println("Czy dodano? " + pesel.add("4444"));
        System.out.println("Czy dodano? " + pesel.add("1111"));
        System.out.println(pesel);
        //sprawdzenie przynaleznosci do zbioru
        System.out.println("Czy jest? " + pesel.contains("1111"));
        System.out.println("Czy jest? " + pesel.contains("5555"));
        //usuniecie wartosci ze zbioru
        pesel.remove("4444");
        System.out.println(pesel);

        Set<String> temp = new HashSet<>();
        temp.addAll(pesel);
        temp.addAll(peseleBydgoszcz);
        System.out.println("Po sumowaniu " + pesel + "+" + peseleBydgoszcz + "=" + temp);

        temp.clear();
        temp.addAll(pesel);
        temp.removeAll(peseleBydgoszcz);
        System.out.println("Odejmowanie " + pesel + "+" + peseleBydgoszcz + "=" + temp);

        temp.clear();
        temp.addAll(pesel);
        temp.retainAll(peseleBydgoszcz);
        System.out.println("Część wspólna" + pesel + "x" + peseleBydgoszcz + "=" + temp);


    }
}
