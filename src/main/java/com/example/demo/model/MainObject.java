package com.example.demo.model;

import java.util.List;

public class MainObject {
    private String field1;
    private String field2;
    private List<SubObject> subObjects;


    public MainObject() {}

    public MainObject(String field1, String field2, List<SubObject> subObjects) {
        this.field1 = field1;
        this.field2 = field2;
        this.subObjects = subObjects;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public List<SubObject> getSubObjects() {
        return subObjects;
    }

    public void setSubObjects(List<SubObject> subObjects) {
        this.subObjects = subObjects;
    }
}
