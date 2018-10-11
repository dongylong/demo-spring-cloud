package com.cloud.order.bean;

import java.io.Serializable;

/**
 * @author dongyl
 * @date 10/16/17.
 * @project user-provider
 */
public class User implements Serializable {

    private long id;

    private String username;
    private String name;
    private int age;
    private double balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
