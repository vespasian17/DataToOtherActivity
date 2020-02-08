package com.example.datatootheractivity;

import java.io.Serializable;

public class TransObj implements Serializable {

    private String name;
    private String surname;

    public TransObj (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

}
