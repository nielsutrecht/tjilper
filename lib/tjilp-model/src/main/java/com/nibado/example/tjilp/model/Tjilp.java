package com.nibado.example.tjilp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Locale;

@Entity
public class Tjilp {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String message;
    private String user;
    private ZonedDateTime time;

    //private List<String> tags;
   // private List<String> mentions;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    /*
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getMentions() {
        return mentions;
    }

    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }*/

    @Override
    public String toString() {
        return String.format(Locale.ROOT, "Tjilp(id=%s, user=%s, message=%s", id, user, message);
    }
}
