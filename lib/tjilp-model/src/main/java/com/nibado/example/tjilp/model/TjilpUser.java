package com.nibado.example.tjilp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TjilpUser {
    @Id
    private String userName;
    private String email;
    private String fullName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
