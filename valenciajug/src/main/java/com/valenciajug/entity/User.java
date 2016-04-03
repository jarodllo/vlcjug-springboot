package com.valenciajug.entity;

import javax.persistence.*;


@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String rol;


    public User() {
        name = "default";
        email = "default@email.com";
        rol = "DEFAULT_ROL";
    }

    public User(String name, String email, String rol) {
        this.name = name;
        this.email = email;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRol() {
        return rol;
    }

}
