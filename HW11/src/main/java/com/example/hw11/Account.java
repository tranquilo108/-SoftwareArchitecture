package com.example.hw11;

public class Account {
    public String getLogin() {
        return login;
    }

    public void setLogin(String name) {
        this.login = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String phone) {
        this.password = phone;
    }
    private String login;
    private String password;

    @Override
    public String toString() {
        return login + " " + password + "\n";
    }

    public Account(String name, String phone) {
        this.login = name;
        this.password = phone;
    }
}
