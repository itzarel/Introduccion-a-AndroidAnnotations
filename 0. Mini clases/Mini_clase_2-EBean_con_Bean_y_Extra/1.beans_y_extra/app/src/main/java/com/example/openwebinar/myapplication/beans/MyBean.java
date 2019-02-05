package com.example.openwebinar.myapplication.beans;

import org.androidannotations.annotations.EBean;

@EBean
public class MyBean {

    private int id;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
