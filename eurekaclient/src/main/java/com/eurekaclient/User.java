package com.eurekaclient;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("User")
public class User {

    protected String name;
    protected String email;
    protected String rol;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
