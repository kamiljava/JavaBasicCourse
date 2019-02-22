package javacollection.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

    String content;
    String author;
    LocalDateTime dateTime;


    public Message(String content, String author) {
        this.content = content;
        this.author = author;
        this.dateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        String pattern = "HH:mm:ss dd-MM-yyyy EEEE";
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern(pattern);
        String date = simpleDateFormat.format(dateTime);

        return "Wiadomosc od: " + author +" odebrano o "+ date + " o tresci: "+ content;

    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
