package com.example.spinnertemplate;

public class User {
    private String username;
    private int age;
    private String mail;

    public User(String username, int age, String mail) {
        this.username = username;
        this.age = age;
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                '}';
    }
}
