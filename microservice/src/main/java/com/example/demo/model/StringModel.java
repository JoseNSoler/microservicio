package com.example.demo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringModel {
    private String value;
    private String date = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format(new Date());

    public StringModel() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "StringModel{" +
                "value='" + value + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
