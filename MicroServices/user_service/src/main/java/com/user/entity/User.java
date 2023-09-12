package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    
    private Long uid;
    private String name;
    private String phone;

    List<Contact> contacts = new ArrayList<>();

    public User() {
    }

    public User(Long uid, String name, String phone) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
    }

    public User(Long uid, String name, String phone, List<Contact> contacts) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    
}
