package com.eshop;

public enum CustomerType {

    REGULAR("Regular"),
    PREMIUM("Premium");

    private String type;

    private CustomerType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
