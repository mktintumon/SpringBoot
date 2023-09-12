package com.user.entity;

public class Contact {
    
    private Long cid;
    private String email;
    private String cname;

    private Long uid;

    public Contact() {
    }

    public Contact(Long cid, String email, String cname, Long uid) {
        this.cid = cid;
        this.email = email;
        this.cname = cname;
        this.uid = uid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    
}
