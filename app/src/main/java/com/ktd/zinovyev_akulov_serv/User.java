package com.ktd.zinovyev_akulov_serv;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String login;
    private String password;


    public User(String pass, String login) {
        this.login = login;
        password = pass;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}