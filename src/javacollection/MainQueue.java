package javacollection;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        //KOLEJKA FIFO
        //deklaracja kolejki
        Queue<LocalTime> times = new ArrayDeque<>();
        //dodawanie wartosci do kolejki jednostronnej
        times.add(LocalTime.of(12,00,00));
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        times.add(LocalTime.now());
        //odczytywanie  wszystkich wartosci z kolejki
        System.out.println(times);
        //usuwanie elementow z kolejki
        System.out.println(times.remove());
        System.out.println(times);
        //-----------------------------------------------------
        //kolejka dwukierunkowa
        Deque<String> people = new ArrayDeque<>();
        //dodawanie elementu
        people.addFirst("Anna");
        people.addLast("Ewa");
        people.addFirst("Janusz");
        people.addLast("Grazyna");
        people.addLast("Ula");
        System.out.println(people);
        //usuwanie od ostatniego
    //    try {
  //      while (people.getLast() != null){
  //          System.out.println(people.removeLast());
  //      }
  //  }catch (NoSuchElementException e){
  //          System.out.println("Koniec kolejki");
  //      }
        System.out.println("Usuwanie od pierwszego");
        while (people.size() !=0){
            System.out.println(people.removeFirst());
        }
}}
