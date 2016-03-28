package com.phonekey.register.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by jordi on 27/03/2016.
 */

@Entity
public class Register {
    @Id
    private String token;

    @Column(name="username")
    private String user;

    protected Register() {
    }

    public Register(String token, String user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
