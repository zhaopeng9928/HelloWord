package com.zhaopeng.beans;

/**
 * @Author zhaopeng
 * @Date 2020/5/15
 */
public class School {
    private String NAME;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @Override
    public String toString() {
        return "School{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}
