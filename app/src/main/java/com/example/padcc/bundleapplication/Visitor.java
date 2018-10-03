package com.example.padcc.bundleapplication;

import java.io.Serializable;

public class Visitor implements Serializable {
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

    String name, email;

}
