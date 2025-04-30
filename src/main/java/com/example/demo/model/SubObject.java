package com.example.demo.model;

public class SubObject {
    private String subField1;
    private String subField2;


    public SubObject() {}

    public SubObject(String subField1, String subField2) {
        this.subField1 = subField1;
        this.subField2 = subField2;
    }

    public String getSubField1() {
        return subField1;
    }

    public void setSubField1(String subField1) {
        this.subField1 = subField1;
    }

    public String getSubField2() {
        return subField2;
    }

    public void setSubField2(String subField2) {
        this.subField2 = subField2;
    }
}
