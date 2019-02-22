package javacollection.controller;

import javacollection.model.Message;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MessageController {

    public Deque<Message> messages = new ArrayDeque<>();

    public void addMassage(String author, String content){
            Message m = new Message(content, author);
            messages.addFirst(m);
        System.out.println("Dodano wiadomości");
    }
    public void getMessage(){
        System.out.println(messages.getLast());
    }
    public void deleteMessage(){
        messages.removeLast();

    }

}
