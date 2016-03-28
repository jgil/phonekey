package com.phonekey.register.web;

/**
 * Created by jordi on 27/03/2016.
 */
public class Device {
    private String token;

    public Device() {
        this.token = null;
    }

    public Device(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
